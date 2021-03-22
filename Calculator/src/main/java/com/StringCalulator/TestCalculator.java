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
	//Task1 Ends
    @Test
    public void Task1Calcultor_ShouldcheckComma() {
		assertEquals(10, Calculator.CalculatorTasks("3,7"));
	}
    //Task 2 Starts - for n number of numbers is handled
    @Test
    public void Task1Calcultor_ShouldcheckMultipleComma() {
		assertEquals(44, Calculator.CalculatorTasks("3,7,8,7,9,10"));
	}
    //Task 3 starts - allow "\n" in place of comma 
    @Test
    public void Task1Calcultor_ShouldcheckMultipleCommaandNewline() {
		assertEquals(10, Calculator.CalculatorTasks("1,2,3\n4"));
	}
}
