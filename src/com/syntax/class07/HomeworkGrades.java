package com.syntax.class07;

import java.util.Scanner;

public class HomeworkGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=input.nextLine().charAt(0);
		String explanation;
		
		if(grade=='A') {
			explanation="Excellent";
		}else if(grade=='B') {
			explanation="Good";
		}else if(grade=='C') {
			explanation="Average";
		}else if(grade=='D') {
			explanation="Bad";
		}else {
			explanation="Not Acceptable";
		}
		System.out.println("Grade "+grade+" is "+explanation+"!");
		
		
	}

}
