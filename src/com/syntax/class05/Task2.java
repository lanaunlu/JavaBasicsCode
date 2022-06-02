package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 * 
		 * can also use true/false-> nextBoolean()
		 */

		Scanner input=new Scanner (System.in);
		System.out.println("Do you have a credit card? yes or no");
		String answer=input.next();
		
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("We will offer you a credit card");
		} else {
			System.out.println("What is the balance of the card");
			int balance=input.nextInt();
			if (balance>1000) {
				System.out.println("Pay if off immediately");
			} else {
				System.out.println("You can spend more");
			}
		}
				
		
	}

}
