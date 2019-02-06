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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//

package org.greenbuttonalliance.espi.common.domain;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * An aggregated summary measurement reading.
 * <p/>
 * <p>
 * Java class for SummaryMeasurement complex type.
 * <p/>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * 
 * <pre>
 * &lt;complexType name="SummaryMeasurement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="powerOfTenMultiplier" type="{http://naesb.org/espi}UnitMultiplier" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://naesb.org/espi}TimeType" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://naesb.org/espi}UnitSymbol" minOccurs="0"/>
 *         &lt;element name="value" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryMeasurement", propOrder = { "powerOfTenMultiplier",
		"timeStamp", "uom", "value" })
@Embeddable
public class SummaryMeasurement extends java.lang.Object {

	protected String powerOfTenMultiplier;
	protected Long timeStamp;
	protected String uom;
	protected Long value;

	public SummaryMeasurement() {
	}

	public SummaryMeasurement(String powerOfTenMultiplier, Long timeStamp,
			String uom, Long value) {
		this.powerOfTenMultiplier = powerOfTenMultiplier;
		this.timeStamp = timeStamp;
		this.uom = uom;
		this.value = value;
	}

	/**
	 * Gets the value of the powerOfTenMultiplier property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getPowerOfTenMultiplier() {
		return powerOfTenMultiplier;
	}

	/**
	 * Sets the value of the powerOfTenMultiplier property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setPowerOfTenMultiplier(String value) {
		this.powerOfTenMultiplier = value;
	}

	/**
	 * Gets the value of the timeStamp property.
	 *
	 * @return possible object is {@link Long }
	 */
	public Long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the timeStamp property.
	 *
	 * @param value
	 *            allowed object is {@link Long }
	 */
	public void setTimeStamp(Long value) {
		this.timeStamp = value;
	}

	/**
	 * Gets the value of the uom property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getUom() {
		return uom;
	}

	/**
	 * Sets the value of the uom property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setUom(String value) {
		this.uom = value;
	}

	/**
	 * Gets the value of the value property.
	 *
	 * @return possible object is {@link Long }
	 */
	public Long getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value
	 *            allowed object is {@link Long }
	 */
	public void setValue(Long value) {
		this.value = value;
	}

}