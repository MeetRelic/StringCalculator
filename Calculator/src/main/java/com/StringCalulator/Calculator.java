package com.StringCalulator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
  
public class Calculator {
	CalServices s ;
     
	public Calculator(CalServices services) {
	  this.s =services;
	}
	
	public int adsd(int i ,int j) {
	 
		return s.newsadd(i, j);
	}
	
	//This Method is main String Calculator Method.
	public static int CalculatorTasks(String input) throws MyException {
			return checkerofStringTypes(input);
		
	}
	
	//sub methods.
	private static int  getAns(String[] splitString) throws MyException {
		int ans = 0;
		String negativechecker  = "";
		boolean checks = false;
		
		for(String s : splitString) {// as there can be n number of number 
			int vals = Integer.parseInt(s);
			if(vals > 1000) { //checks greater than 1000 if true than continue
				continue;
			}
			
			ans  += vals;
			
			if(vals < 0 ) {
				//checks for negative and adds to show the negative values in exception
				negativechecker += s + " ";
				checks = true;
			}
			
		}
		if(checks) { //checks for negative and throws exception
			String throwstring ="negatives not allowed" +"- "+(negativechecker );
			throw  new MyException(throwstring);  
		}
		
		return ans;
	}
	
	private static String[] customDelimetedString(String input) {
		Matcher pattern = Pattern.compile("//(.)\n(.*)").matcher(input);
		pattern.matches();
		String delimeters = pattern.group(1);
		String values = pattern.group(2);
		//as dot in java is sensitive
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
	private static int checkerofStringTypes(String input) throws MyException {
		//first we check if string is empty || Null we return 0
		if(input.isEmpty()) {
			return 0;
		}
		else {
			if(input.startsWith("//")) {
				return getAns(customDelimetedString(input));	
		}	else {
				return getAns(commaandnewLineDelimeted(input));
		}
		}
	}
}
