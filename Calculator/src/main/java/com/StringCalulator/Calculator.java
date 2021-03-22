package com.StringCalulator;



public class Calculator {
	//This Method is main String Calculator Method for 
	
	public static int CalculatorTasks(String input) {
		//first we check if string is empty || Null we return 0
		if(input.isEmpty()) {
			return 0;
		}else if(input.contains(",") || input.contains("|")) {
			//if we get comma now we know as "," or "\n"  there is n number and our test is to return sum of it , so will return!!
		    String [] splitfromcomma = input.split(",|\n");
		    int ans = 0;
		   for(String s : splitfromcomma) { // as there can be n number of number in comma
		    	ans += Integer.parseInt(s);
		    }
		   
		    return ans;
		}
		else {
			//if not null and only one value in string we return directly Same int 
			return Integer.parseInt(input);
		}
		
	}
}
