package com.StringCalulator;



public class Calculator {
	//This Method is main String Calculator Method for 
	
	public static int CalculatorTasks(String input) {
		//first we check if string is empty || Null we return 0
		if(input.isEmpty()) {
			return 0;
		}
		else {
			//if not null and only one value in string we return directly Same int 
			return Integer.parseInt(input);
		}
		
	}
}
