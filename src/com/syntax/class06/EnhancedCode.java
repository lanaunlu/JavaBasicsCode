package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the score you get in quiz");
		int quizScore = scanner.nextInt();
		
		System.out.println("Enter the score you get in midterm");
		int midTermScore = scanner.nextInt();
		
		System.out.println("Enter the score you get in final");
		int finalScore = scanner.nextInt();
		
		int averageS = (quizScore + midTermScore + finalScore) / 3;
		
		System.out.println("Your average score is " + averageS);
		char grade;
		
		if(averageS>=90) {
			grade='A';
			
		}else if (averageS >= 70 && averageS >=90) {
			grade='B';
			
		}else if (averageS >= 50 && averageS < 70) {
			grade='C';
			
		}else {
			grade='F';
			
		}
		
		System.out.println("You are a "+grade+" student");
			
		/*If you are A or B student --> you are doing great
		 * otherwise --> please try to study more
		 */
	
		if(grade=='A' || grade=='B') {
			System.out.println("You are doing great");
		}else {
			System.out.println("Please try to study more");
		} scanner.close();
	}

}
