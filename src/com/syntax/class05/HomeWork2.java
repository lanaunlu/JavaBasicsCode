package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city __ is __”
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the city: ");
		String city = scanner.nextLine();
		System.out.println("Enter the temperature in Fahrenheit: ");
		float fahrenheit = scanner.nextFloat();
		float celsius = ((fahrenheit - 32)*5) /9;
		System.out.println("The temperature is the city " + city + " is " + celsius);
		scanner.close();

	}

}
