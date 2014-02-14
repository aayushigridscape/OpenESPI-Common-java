package org.energyos.espi.common.utils;

import java.util.List;

import org.energyos.espi.common.domain.IdentifiedObject;
import org.energyos.espi.common.domain.MeterReading;
import org.energyos.espi.common.domain.ReadingType;
import org.energyos.espi.common.domain.TimeConfiguration;
import org.energyos.espi.common.domain.UsagePoint;
import org.energyos.espi.common.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional (rollbackFor= {javax.xml.bind.JAXBException.class}, 
                noRollbackFor = {javax.persistence.NoResultException.class, org.springframework.dao.EmptyResultDataAccessException.class })

public class ResourceLinker {
    @Autowired
    private ResourceService resourceService;

    public void link(IdentifiedObject resource) {
        linkUp(resource);
        linkUpMember(resource);
        resourceService.persist(resource);
        linkRelatedCollection(resource);
    }

    public void linkUp(IdentifiedObject resource) {
        if (resource.getUpLink() != null) {
            List<IdentifiedObject> parents = resourceService.findByAllParentsHref(resource.getUpLink().getHref(), resource);
            for(IdentifiedObject parent : parents) {
                if (parent != null) {
                    resource.setUpResource(parent);
                    resourceService.persist(parent);
                    resourceService.persist(resource);
                }
            }
        }
    }

    public void linkUpMember(IdentifiedObject resource) {
        if (resource.getSelfLink() != null) {
            List<IdentifiedObject> parentResources = resourceService.findByAllParentsHref(resource.getSelfLink().getHref(), resource);
            for(IdentifiedObject parentResource : parentResources) {
                if (parentResource != null) {
                    if (resource instanceof TimeConfiguration) {
                        UsagePoint usagePoint = (UsagePoint)parentResource;
                        if (usagePoint.getLocalTimeParameters() == null) {
                           usagePoint.setLocalTimeParameters((TimeConfiguration)resource);
                           ((TimeConfiguration)resource).setUsagePoint(usagePoint);
                        }
                    }

                    if (resource instanceof ReadingType) {
                        MeterReading meterReading = (MeterReading) parentResource;
                        if (meterReading.getReadingType() == null) {
                          meterReading.setReadingType((ReadingType) resource);
                          ((ReadingType)resource).setMeterReading(meterReading);
                        }
                    }
                    resourceService.persist(parentResource);
                }
            }
        }
    }

    public void linkRelatedCollection(IdentifiedObject resource) {
            List<IdentifiedObject> relatedResources = resourceService.findAllRelated(resource);

            for(IdentifiedObject relatedResource : relatedResources) {
                relatedResource.setUpResource(resource);
                resourceService.persist(relatedResource);
            }
    }

    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }
}
