package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program that will ask user to input inputs the current time 
		 * (use 24 hour format).
		 * Based on the given time define:
		 * if hour is between 1-11 --> Morning
		 * if hour between 12-15 --> Afternoon
		 * if hour between 16-20 --> Evening
		 * if hour between 21-24 --> Night
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the current time in 24 hour format");
		float time=scanner.nextFloat();
		
		if (time >= 1 && time <= 11) {
			System.out.println("It's morning");
		}else if (time >= 12 && time <= 15) {
			System.out.println("It's afternoon");
		}else if (time >= 16 && time <=20) {
			System.out.println("It's evening");
		}else if (time >= 21 && time <= 24) {
			System.out.println("It's night");
		}
				scanner.close();
}
	}
