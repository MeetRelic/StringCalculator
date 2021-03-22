package com.StringCalulator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	
	private static int  getAns(String[] splitString) {
		int ans = 0;
		for(String s : splitString) {// as there can be n number of number 
			
			ans  += Integer.parseInt(s);
		}
		return ans;
	}
	
	private static String[] customDelimetedString(String input) {
		Matcher pattern = Pattern.compile("//(.)\n(.*)").matcher(input);
		pattern.matches();
		String delimeters = pattern.group(1);
		String values = pattern.group(2);
		if(delimeters.contains(".")) {
			return values.split("\\.");
		}
		return values.split(delimeters);
	}
	private static String[] commaandnewLineDelimeted(String input) {
		//if we get comma now we know as "," or "\n"  there is n number and our test is to return sum of it , so will return!!
		if(input.contains(",") || input.contains("|")){
			String [] splitfromcomma = input.split(",|\n");
			return splitfromcomma;
		}else {
			return input.split("");
		}
		
	}
	private static int checkerofStringTypes(String input) {
		if(input.startsWith("//")) {
		return getAns(customDelimetedString(input));	
		}else {
		return getAns(commaandnewLineDelimeted(input));
		}
	}
	
	
	//This Method is main String Calculator Method.
	public static int CalculatorTasks(String input) {
		//first we check if string is empty || Null we return 0
		if(input.isEmpty()) {
			return 0;
		}else {
			return checkerofStringTypes(input);
		}
		
	}
}
