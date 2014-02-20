/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//


package org.energyos.espi.common.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.energyos.espi.common.models.atom.adapters.ReadingTypeAdapter;


/**
 * Characteristics associated with all Readings included in a MeterReading.
 * <p/>
 * <p>Java class for ReadingType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ReadingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="accumulationBehaviour" type="{http://naesb.org/espi}AccumulationBehavior" minOccurs="0"/>
 *         &lt;element name="commodity" type="{http://naesb.org/espi}Commodity" minOccurs="0"/>
 *         &lt;element name="consumptionTier" type="{http://naesb.org/espi}ConsumptionTier" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://naesb.org/espi}Currency" minOccurs="0"/>
 *         &lt;element name="dataQualifier" type="{http://naesb.org/espi}DataQualifier" minOccurs="0"/>
 *         &lt;element name="defaultQuality" type="{http://naesb.org/espi}QualityOfReading" minOccurs="0"/>
 *         &lt;element name="flowDirection" type="{http://naesb.org/espi}DirectionOfFlow" minOccurs="0"/>
 *         &lt;element name="intervalLength" type="{http://naesb.org/espi}UInt32" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://naesb.org/espi}Kind" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://naesb.org/espi}PhaseCode" minOccurs="0"/>
 *         &lt;element name="powerOfTenMultiplier" type="{http://naesb.org/espi}UnitMultiplier" minOccurs="0"/>
 *         &lt;element name="timeAttribute" type="{http://naesb.org/espi}TimePeriodOfInterest" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://naesb.org/espi}UnitSymbol" minOccurs="0"/>
 *         &lt;element name="cpp" type="{http://naesb.org/espi}CPP" minOccurs="0"/>
 *         &lt;element name="interharmonic" type="{http://naesb.org/espi}ReadingInterharmonic" minOccurs="0"/>
 *         &lt;element name="measuringPeriod" type="{http://naesb.org/espi}TimeAttribute" minOccurs="0"/>
 *         &lt;element name="tou" type="{http://naesb.org/espi}TOU" minOccurs="0"/>
 *         &lt;element name="argument" type="{http://naesb.org/espi}RationalNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name="ReadingType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadingType", propOrder = {
        "accumulationBehaviour",
        "commodity",
        "consumptionTier",
        "currency",
        "dataQualifier",
        "defaultQuality",
        "flowDirection",
        "intervalLength",
        "kind",
        "phase",
        "powerOfTenMultiplier",
        "timeAttribute",
        "tou",
        "uom",
        "cpp",
        "interharmonic",
        "measuringPeriod",
        "argument"
})
@Entity
@Table(name = "reading_types", uniqueConstraints = {@UniqueConstraint(columnNames={"uuid"})})
@XmlJavaTypeAdapter(ReadingTypeAdapter.class)
@NamedQueries(value = {
        @NamedQuery(name = ReadingType.QUERY_FIND_BY_ID,
                query = "SELECT readingType FROM ReadingType readingType WHERE readingType.id = :id"),
        @NamedQuery(name = ReadingType.QUERY_FIND_BY_UUID,
                query = "SELECT readingType FROM ReadingType readingType WHERE readingType.uuid = :uuid"),
        @NamedQuery(name = ReadingType.QUERY_FIND_ALL_IDS_BY_USAGE_POINT_ID,
                query = "SELECT meterReading.readingType.id FROM MeterReading meterReading WHERE meterReading.usagePoint.id = :usagePointId"),
        @NamedQuery(name = ReadingType.QUERY_FIND_ALL_IDS,
                query = "SELECT readingType.id FROM ReadingType readingType"),
        @NamedQuery(name = ReadingType.QUERY_FIND_ALL_IDS_BY_XPATH_0, query = "SELECT DISTINCT r.id FROM ReadingType r"),
        @NamedQuery(name = ReadingType.QUERY_FIND_ID_BY_XPATH, query = "SELECT DISTINCT r.id FROM ReadingType r WHERE r.id = :o1Id")

})
public class ReadingType
        extends IdentifiedObject
{

    public static final String QUERY_FIND_BY_ID = "ReadingType.findById";
    public static final String QUERY_FIND_BY_UUID = "ReadingType.findByUUID";
    public static final String QUERY_FIND_ALL_IDS_BY_USAGE_POINT_ID = "ReadingType.findAllIdsByUsagePointId";
	public static final String QUERY_FIND_ALL_IDS = "ReadingType.findAllIds";
    public static final String QUERY_FIND_ALL_IDS_BY_XPATH_0 = "ReadingType.findAllIdsByXpath0";
    public static final String QUERY_FIND_ID_BY_XPATH = "ReadingType.findIdsByXpath";

    //@XmlTransient
    //@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    //@JoinColumn(name = "meter_reading_id")
	//private MeterReading meterReading;
	
    protected String accumulationBehaviour;
    protected String commodity;
    protected String consumptionTier;
    protected String currency;
    protected String dataQualifier;
    protected String defaultQuality;
    protected String flowDirection;
    protected Long intervalLength;
    protected String kind;
    protected String phase;
    protected String powerOfTenMultiplier;
    protected String timeAttribute;
    protected String uom;
    protected String cpp;
    protected String measuringPeriod;
    protected String tou;

    @Embedded
    protected RationalNumber argument;
    @Embedded
    protected ReadingInterharmonic interharmonic;

    //public void setMeterReading(MeterReading meterReading) {
    //	this.meterReading = meterReading;
    //}
    
    //public MeterReading getMeterReading() {
    //	return this.meterReading;
    //}
    
    /**
     * Gets the value of the accumulationBehaviour property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAccumulationBehaviour() {
        return accumulationBehaviour;
    }

    /**
     * Sets the value of the accumulationBehaviour property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccumulationBehaviour(String value) {
        this.accumulationBehaviour = value;
    }

    /**
     * Gets the value of the commodity property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCommodity(String value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the dataQualifier property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataQualifier() {
        return dataQualifier;
    }

    /**
     * Sets the value of the dataQualifier property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDataQualifier(String value) {
        this.dataQualifier = value;
    }

    /**
     * Gets the value of the flowDirection property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFlowDirection() {
        return flowDirection;
    }

    /**
     * Sets the value of the flowDirection property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlowDirection(String value) {
        this.flowDirection = value;
    }

    /**
     * Gets the value of the intervalLength property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getIntervalLength() {
        return intervalLength;
    }

    /**
     * Sets the value of the intervalLength property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setIntervalLength(Long value) {
        this.intervalLength = value;
    }

    /**
     * Gets the value of the kind property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the phase property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the powerOfTenMultiplier property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPowerOfTenMultiplier() {
        return powerOfTenMultiplier;
    }

    /**
     * Sets the value of the powerOfTenMultiplier property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPowerOfTenMultiplier(String value) {
        this.powerOfTenMultiplier = value;
    }

    /**
     * Gets the value of the timeAttribute property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTimeAttribute() {
        return timeAttribute;
    }

    /**
     * Sets the value of the timeAttribute property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeAttribute(String value) {
        this.timeAttribute = value;
    }

    /**
     * Gets the value of the uom property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the consumptionTier property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getConsumptionTier() {
        return consumptionTier;
    }

    /**
     * Sets the value of the consumptionTier property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConsumptionTier(String value) {
        this.consumptionTier = value;
    }

    /**
     * Gets the value of the cpp property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCpp() {
        return cpp;
    }

    /**
     * Sets the value of the cpp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCpp(String value) {
        this.cpp = value;
    }

    /**
     * Gets the value of the currency property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the interharmonic property.
     *
     * @return possible object is
     *         {@link ReadingInterharmonic }
     */
    public ReadingInterharmonic getInterharmonic() {
        return interharmonic;
    }

    /**
     * Sets the value of the interharmonic property.
     *
     * @param value allowed object is
     *              {@link ReadingInterharmonic }
     */
    public void setInterharmonic(ReadingInterharmonic value) {
        this.interharmonic = value;
    }

    /**
     * Gets the value of the measuringPeriod property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMeasuringPeriod() {
        return measuringPeriod;
    }

    /**
     * Sets the value of the measuringPeriod property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMeasuringPeriod(String value) {
        this.measuringPeriod = value;
    }

    /**
     * Gets the value of the tou property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTou() {
        return tou;
    }

    /**
     * Sets the value of the tou property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTou(String value) {
        this.tou = value;
    }

    /**
     * Gets the value of the defaultQuality property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDefaultQuality() {
        return defaultQuality;
    }

    /**
     * Sets the value of the defaultQuality property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultQuality(String value) {
        this.defaultQuality = value;
    }

    /**
     * Gets the value of the argument property.
     *
     * @return possible object is
     *         {@link RationalNumber }
     */
    public RationalNumber getArgument() {
        return argument;
    }

    /**
     * Sets the value of the argument property.
     *
     * @param value allowed object is
     *              {@link RationalNumber }
     */
    public void setArgument(RationalNumber value) {
        this.argument = value;
    }

    @Override
    public String getParentQuery() {
        return MeterReading.QUERY_FIND_BY_RELATED_HREF;
    }
    
    @Override
    public void merge(IdentifiedObject resource) {
    	super.merge(resource);
    	this.accumulationBehaviour = ((ReadingType)resource).accumulationBehaviour;
    	this.argument = ((ReadingType)resource).argument;
    	this.commodity = ((ReadingType)resource).commodity;
    	this.consumptionTier = ((ReadingType)resource).consumptionTier;
    	this.cpp = ((ReadingType)resource).cpp;
    	this.currency = ((ReadingType)resource).currency;
    	this.dataQualifier = ((ReadingType)resource).dataQualifier;
    	this.defaultQuality = ((ReadingType)resource).defaultQuality;
    	this.flowDirection = ((ReadingType)resource).flowDirection;
    	this.interharmonic = ((ReadingType)resource).interharmonic;
    	this.intervalLength = ((ReadingType)resource).intervalLength;
    	this.kind = ((ReadingType)resource).kind;
    	this.measuringPeriod = ((ReadingType)resource).measuringPeriod;
    	this.phase = ((ReadingType)resource).phase;
    	this.powerOfTenMultiplier = ((ReadingType)resource).powerOfTenMultiplier;
    	this.timeAttribute = ((ReadingType)resource).timeAttribute;
    	this.tou = ((ReadingType)resource).tou;
    	this.uom = ((ReadingType)resource).uom;
    }
}
