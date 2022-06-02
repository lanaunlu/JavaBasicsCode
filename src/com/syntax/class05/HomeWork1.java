package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the amount of loan needed?");
		int moneyNeeded = scanner.nextInt();
		
		if (moneyNeeded <=200000) {
			System.out.println("Loan Approved");
		}else {
			System.out.println("Loan Rejected");
		}
		}
	}


