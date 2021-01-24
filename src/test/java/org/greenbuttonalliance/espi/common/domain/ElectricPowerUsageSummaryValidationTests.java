/*
 *
 *    Copyright (c) 2018-2021 Green Button Alliance, Inc.
 *
 *    Portions (c) 2013-2018 EnergyOS.org
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
 */

package org.greenbuttonalliance.espi.common.domain;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.greenbuttonalliance.espi.common.support.EspiFactory.newElectricPowerUsageSummary;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

public class ElectricPowerUsageSummaryValidationTests {

	@Test
	public void isValid() {
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

		ElectricPowerUsageSummary electricPowerUsageSummary = newElectricPowerUsageSummary();

		Set<ConstraintViolation<ElectricPowerUsageSummary>> violations = validator
				.validate(electricPowerUsageSummary);

		assertThat(violations, is(empty()));
	}
}
