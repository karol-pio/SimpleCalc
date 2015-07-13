package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "positiveCases")
public class PositiveCases {
	SimpleCalculator simpleCalculator;
	int memory = 0;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test(dataProvider = "create")
	public void addingTest(int x, int y) {

		// Given
		System.out.println("x: " + x + " y: " + y);

		// When
		int z = simpleCalculator.add(x, y);

		// Than
		Assert.assertEquals(z, x + y);

	}

	@Test(dataProvider = "create")
	public void minusTest(int x, int y) {

		// Given

		// When
		int z = simpleCalculator.minus(x, y);

		// Than
		Assert.assertEquals(z, x - y);

	}

	@Test(dataProvider = "create")
	public void multiplyTest(int x, int y) {

		// Given

		// When
		int z = simpleCalculator.multiply(x, y);

		// Than
		Assert.assertEquals(z, x * y);

	}

	@Test(dataProvider = "create")
	public void divideTest(float x, float y) {

		// Given

		// When
		float z = simpleCalculator.divide(x, y);

		// Than
		Assert.assertEquals(z, x / y);

	}

	@Test()
	public void addToMemory() {
		// Given
		int x = 5;
		memory = 5;
		// When
		simpleCalculator.addToMemory(x);
		// Than
		Assert.assertEquals(memory, x);
	}

	@Test()
	public void setMemory() {
		// Given
		int x = 2;
		memory = 2;
		System.out.println("setting to memory");
		// When
		simpleCalculator.setMemory(x);

		// Than
		Assert.assertEquals(memory, 2);
	}

	@Test()
	public void getMemory() {
		memory = 3;
		Assert.assertEquals(memory, 3);
	}

	@DataProvider(name = "create")
	public Object[][] createData() {
		return new Object[][] { { 3, 10 }, { 55, 5 }, { 23, 3 }, { 145, 7 }, { 12, 99 }, { 3, 140 }, { 55, 45 },
				{ 243, 3 }, { 145, 47 }, { 132, 99 } };
	}

}
