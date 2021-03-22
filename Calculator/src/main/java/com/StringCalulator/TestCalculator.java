package com.StringCalulator;

import static org.junit.Assert.*;
import org.junit.Test;


//This is Junit Testing class for String Calculator Method.
public class TestCalculator {
    //Task 1 starts here....
	@Test
	public void Task1Calcultor_ShouldverifyNull() throws MyException {
	assertEquals(0, Calculator.CalculatorTasks(""));
	}
	@Test
	public void Task1Calcultor_ShouldreturnInteger() throws MyException {
		assertEquals(5, Calculator.CalculatorTasks("5"));
	}
	//Task1 Ends
    @Test
    public void Task1Calcultor_ShouldcheckComma() throws MyException {
		assertEquals(10, Calculator.CalculatorTasks("3,7"));
	}
    //Task 2 Starts - for n number of numbers is handled
    @Test
    public void Task1Calcultor_ShouldcheckMultipleComma() throws MyException {
		assertEquals(44, Calculator.CalculatorTasks("3,7,8,7,9,10"));
	}
    //Task 3 starts - allow "\n" in place of comma 
    @Test
    public void Task1Calcultor_ShouldcheckMultipleCommaandNewline() throws MyException {
		assertEquals(10, Calculator.CalculatorTasks("1,2,3\n4"));
	}
    //Task 4 starts - allow custom delimeter which starts with "//" just to identify
    //default delimeter here is ; which works fine
    @Test
    public void Task1Calcultor_ShouldcheckDefault() throws MyException {
		assertEquals(6, Calculator.CalculatorTasks("//;\n4;2"));
	}
    //Test for . default delimeter 
    @Test
    public void Task1Calcultor_ShouldcheckDefault1() throws MyException {
		assertEquals(4, Calculator.CalculatorTasks("//.\n2.2"));
	}
    //Task 5 - get all Negative with Exceptions
    @Test
    public void Task1Calcultor_CheckNegative() {
    	try {
		assertEquals("negatives not allowed-", Calculator.CalculatorTasks("-1,-2,3"));
		fail();
    	}
    	catch(MyException ex) {
    		
    	}
	}
    //Number greater than 100 ignored 
    @Test
    public void Task1Calcultor_Ignore() throws MyException {
		assertEquals(9, Calculator.CalculatorTasks("1001,2,3,4")); 
	}
   
}
