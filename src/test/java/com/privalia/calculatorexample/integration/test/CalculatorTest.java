package com.privalia.calculatorexample.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.privalia.calculatorexample.Calculator;
import com.privalia.calculatorexample.ICalculator;

public class CalculatorTest {

	// Polimorfismo de Interfaces
	ICalculator iCalculator = new Calculator();
	
	
	@Test
	public void sumaTest() {
		//fail("Not yet implemented");
		assertTrue(iCalculator.add(2, 2) == 4);
	}

	@Test
	public void restaTest() {
		assertTrue(iCalculator.substract(2, 2) == 0);
	}
	
	@Test
	public void multiplicacionTest() {
		assertTrue(iCalculator.multiply(2, 2) == 4);
	}
	
	@Test
	public void divisionTest() {
		assertTrue(iCalculator.divide(2, 2) == 1);
	}
	
}
