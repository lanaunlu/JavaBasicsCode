package com.syntax.class05;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
		 * Example: if user is born in March, April, May → season =“Spring”
		 * if user is born in June, July, August →season =“Summer” etc …
		 * At the end of the program we should see output as 
		 * “You were born in season ______“.
		 */

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
			System.out.println("You wer born in season " + month);
			scanner.close();
			
				
	}

}
