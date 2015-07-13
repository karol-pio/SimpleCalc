package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Test(groups="failingCases")
public class FailingCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test(dependsOnMethods = { "minusTest" })
	public void addingTest() {

		// Given
		int x = 5;
		int y = 10;

		// When
		int z = simpleCalculator.add(x, y);

		// Than
		Assert.assertEquals(z, 15);

	}

	@Test()
	public void minusTest() {

		// Given
		int x = 5;
		int y = 10;

		// When
		int z = simpleCalculator.minus(x, y);

		// Than
		Assert.assertEquals(z, 5);

	}

	@Test(dependsOnMethods = { "minusTest" })
	public void multiplyTest() {

		// Given
		int x = 5;
		int y = 10;

		// When
		int z = simpleCalculator.multiply(x, y);

		// Than
		Assert.assertEquals(z, 50);

	}
}
