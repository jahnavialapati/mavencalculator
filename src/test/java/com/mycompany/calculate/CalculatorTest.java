package com.mycompany.calculate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator addCalculator;
	private Calculator subtractCalculator;
	private Calculator multiplicationCalculator;
	private Calculator divisionCalculator;
	@Before
	public void setUp(){
		addCalculator=new Calculator();
		subtractCalculator=new Calculator();
		multiplicationCalculator=new Calculator();
		divisionCalculator=new Calculator();
	}
	
	@Test
	public void testForAddTwoPositiveNumbers() {
		int answer=addCalculator.addNumbers(50,50);
		assertEquals(100,answer);
	}
	@Test
	public void testForAddTwoNegativeNumbers() {
		int answer=addCalculator.addNumbers(-50,-50);
		assertEquals(-100,answer);
	}
	@Test
	public void testForAddOneNegativeNumber() {
		int answer=addCalculator.addNumbers(-50,50);
		assertEquals(0,answer);
	}
	@Test
	public void testForAddTwoZeros() {
		int answer=addCalculator.addNumbers(0,0);
		assertEquals(0,answer);
	}
	@Test
	public void testForAddOneZeroAndPostive() {
		int answer=addCalculator.addNumbers(0,50);
		assertEquals(50,answer);
	}
	@Test
	public void testForAddOneZeroAndNegative() {
		int answer=addCalculator.addNumbers(0,50);
		assertEquals(50,answer);
	}
	
	
	@Test
	public void subtractTwoPositiveNumbers() {
		int answer=subtractCalculator.subtractNumbers(6, 3);
		assertEquals(3,answer);
	}
	@Test
	public void subtractTwoNegativeNumbers() {
		int answer=subtractCalculator.subtractNumbers(-6,-3);
		assertEquals(-3,answer);
	}
	@Test
	public void subtractSecondValueNegativeNumber() {
		int answer=subtractCalculator.subtractNumbers(6,-3);
		assertEquals(9,answer);
	}
	@Test
	public void subtractFirstValueNegativeNumber() {
		int answer=subtractCalculator.subtractNumbers(6,-3);
		assertEquals(9,answer);
	}
	@Test
	public void subtractOneZeroAndNegative() {
		int answer=subtractCalculator.subtractNumbers(0,3);
		assertEquals(-3,answer);
	}
	
	
	@Test
	public void multiplyTwoPositiveNumbers() {
		int answer=multiplicationCalculator.multiplicationNumbers(2,3);
		assertEquals(6,answer);
	}
	@Test
	public void multiplyTwoNegativeNumbers() {
		int answer=multiplicationCalculator.multiplicationNumbers(-2,-3);
		assertEquals(6,answer);
	}
	@Test
	public void multiplyOneNegativeNumber() {
		int answer=multiplicationCalculator.multiplicationNumbers(-2,3);
		assertEquals(-6,answer);
	}
	@Test
	public void multiplyZeroAndPositiveNumbers() {
		int answer=multiplicationCalculator.multiplicationNumbers(0,3);
		assertEquals(0,answer);
	}
	@Test
	public void multiplyZeroAndNegativeNumbers() {
		int answer=multiplicationCalculator.multiplicationNumbers(0,-3);
		assertEquals(0,answer);
	}
	
	
	@Test
	public void divideTwoPositiveNumbers() {
		double answer=divisionCalculator.divisionNumbers(6,3);
		assertEquals(2.0,answer,0.0);
	}
	@Test
	public void divideTwoNegativeNumbers() {
		double answer=divisionCalculator.divisionNumbers(-6,-3);
		assertEquals(2.0,answer,0.0);
	}
	@Test
	public void divideOneNegativeNumber() {
		double answer=divisionCalculator.divisionNumbers(-6,3);
		assertEquals(-2.0,answer,0.0);
	}
	/*@Test
	public void divideByZero() {
		double answer=divisionCalculator.divisionNumbers(-6,0);
		assertEquals(2.0,answer,0.0);
	}*/
}
