package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * declare a secret number;
		 * you want to ask user to guess your secret number
		 * your code should keep asking to guess until user gets your secret number
		 * Once user gets the secret numbers -> you go it!
		 */
		
		int secretNum = 25;
		int guessedNum;
		
		Scanner scanner = new Scanner (System.in);
		
		do {
		System.out.println("Guess my secret number");
		guessedNum = scanner.nextInt();
		} while (guessedNum != secretNum);
		
		System.out.println("You got it");
		scanner.close();
		
	}

}
