package com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import capgemini.com.TaxCalculator;

public class TaxTest {

	@Test
	public void testIsIndianFalse() throws Exception {
		TaxCalculator tax = new TaxCalculator();
		double ans = tax.calculateTax("Ron", false, 34000.00);
		Assert.assertEquals(0, ans, 0);

	}

	@Test
	public void testTaxNotEligible() throws Exception {
		TaxCalculator tax = new TaxCalculator();
		double ans = tax.calculateTax("Tim", true, 1000.00);
		Assert.assertEquals(0, ans, 0);

	}

	@Test
	public void testValidCase() throws Exception {
		TaxCalculator tax = new TaxCalculator();
		double ans = tax.calculateTax("Jack", true, 55000.00);
		Assert.assertEquals(3300, ans, 0);

	}

	@Test
	public void testNullName() throws Exception {
		TaxCalculator tax = new TaxCalculator();
		double ans = tax.calculateTax("", true, 30000.00);
		Assert.assertEquals(0, ans, 0);

	}

}
