/*
 *    Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *
 *    Portions copyright (c) 2013-2018 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.23 at 04:09:58 PM EDT 
//

package org.greenbuttonalliance.espi.common.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TokenType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="TokenType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bearer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TokenType")
@XmlEnum
public enum TokenType {

	@XmlEnumValue("Bearer")
	BEARER("Bearer");
	private final String value;

	TokenType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static TokenType fromValue(String v) {
		// lower case the value to insure the OAuth2 representation of "bearer"
		// is satisfied
		// ref: https://github.com/energyos/OpenESPI-ommon-java/issues/190

		if (v.equals("bearer"))
			v = "Bearer";

		for (TokenType c : TokenType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
