package com.StringCalulator;

import static org.junit.Assert.*;
import org.junit.Test;


//This is Junit Testing class for String Calculator Method.
public class TestCalculator {
    //Task 1 starts here....
	@Test
	public void Task1Calcultor_ShouldverifyNull() {
	assertEquals(0, Calculator.CalculatorTasks(""));
	}
	@Test
	public void Task1Calcultor_ShouldreturnInteger() {
		assertEquals(5, Calculator.CalculatorTasks("5"));
	}
    @Test
    public void Task1Calcultor_ShouldcheckComma() {
		assertEquals(10, Calculator.CalculatorTasks("3,7"));
	}
    @Test
    public void Task1Calcultor_ShouldcheckMultipleComma() {
		assertEquals(44, Calculator.CalculatorTasks("3,7,8,7,9,10"));
	}
}
