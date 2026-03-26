/*
File: Lesson 3.2 - If and Else Statements
Author: Stephen Li
Date Created: Mar 24, 2026
Date Last Modified: Mar 24, 2026
*/

public class PracticeProblem
{
	public static void main(String[] args) {

	}
	
	public static String isFive(int num1) {
	    if (num1 == 5) {
	        return "The number is Five";
	    }
	    else {
	        return "The number is not Five";
	    }
	}
	
	public static String positiveOrNegative(double num1) {
	    if (num1 > 0) {
	        return "Positive";
	    }
	    else {
	        return "Negative";
	    }
	}
	
	public static String highOrLow(int num1) {
	    if (num1 > 100) {
	        return "High";
	    }
	    else {
	        return "Low";
	    }
	}
	
	public static String isHello(String word1) {
	    if (word1.equals("Hello")) {
	        return "The word is Hello";
	    }
	    else {
	        return "The word is not Hello";
	    }
	}
}
