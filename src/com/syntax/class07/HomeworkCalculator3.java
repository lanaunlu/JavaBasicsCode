package com.syntax.class07;

import java.util.Scanner;

public class HomeworkCalculator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int sum, num1, num2;
		
		System.out.println("Please enter the first number");
		num1 = input.nextInt();
		System.out.println("Please enter the second number");
		num2 = input.nextInt();
		System.out.println("Choose operator: Add, Subtract, Multiply, or Divide");
		String mathOperator = input.next();
		if (mathOperator.equalsIgnoreCase("Add")) {
			sum = (num1 + num2);
		} else if (mathOperator.equalsIgnoreCase("Subtract)")) {
			sum = (num1 - num2);
		} else if (mathOperator.equalsIgnoreCase("Multiply")) {
			sum = (num1 * num2);
		} else {
			sum = (num1 / num2);
		}
		System.out.println("The first number you entered was " + num1 + ", the second number you entered was " + num2
				+ ", and using the math operator  " + mathOperator + " the result = " + sum);
	}

}
