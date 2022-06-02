package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the month of your birthday");
		String month = scanner.nextLine();
		
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") 
				|| month.equalsIgnoreCase("February")) {
			month = "winter";
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			month = "spring";
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			month = "summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			month = "fall";
		}
		
		System.out.println("You were born in " + month);
	}

}
