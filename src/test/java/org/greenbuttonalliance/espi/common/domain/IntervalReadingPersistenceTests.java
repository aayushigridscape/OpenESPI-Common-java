/*
 * Copyright (c) 2013, 2014, 2015, 2016, 2017, 2018 EnergyOS.org
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *
 * ********************************************************************************
 *
 *  Copyright (c) 2018 Green Button Alliance, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.greenbuttonalliance.espi.common.domain;

import org.greenbuttonalliance.espi.common.atom.XMLTest;
import org.greenbuttonalliance.espi.common.support.TestUtils;
import org.hibernate.annotations.LazyCollection;
import org.junit.Test;

import javax.persistence.*;

public class IntervalReadingPersistenceTests extends XMLTest {

	@Test
	public void persistence() {
		TestUtils.assertAnnotationPresent(IntervalReading.class, Entity.class);
		TestUtils.assertAnnotationPresent(IntervalReading.class, Table.class);
	}

	@Test
	public void readingQualities() {
		TestUtils.assertAnnotationPresent(IntervalReading.class, "readingQualities",
				OneToMany.class);
		TestUtils.assertAnnotationPresent(IntervalReading.class, "readingQualities",
				LazyCollection.class);
	}

	@Test
	public void timePeriod() {
		TestUtils.assertAnnotationPresent(IntervalReading.class, "timePeriod",
				Embedded.class);
	}

	@Test
	public void intervalBlock() {
		TestUtils.assertAnnotationPresent(IntervalReading.class, "intervalBlock",
				ManyToOne.class);
		TestUtils.assertAnnotationPresent(IntervalReading.class, "intervalBlock",
				JoinColumn.class);
	}
}