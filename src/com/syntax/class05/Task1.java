package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	
		/* You are DMV representative and you need to ask customer their age.
		 *  If they are 18 and older you will issue a driver license to them,
		 *  otherwise you will offer them to get a learners permit. 
		 */
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter age");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("We will issue a drivers license for you");
		}else {
			System.out.println("We will offer you a learners permit");
		}

	}

}
