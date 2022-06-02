package com.syntax.class07;

import java.util.Scanner;

public class HomeworkCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a digit!");
		int a=input.nextInt();
		
		System.out.println("Please enter a operator");
		char operator=input.next().charAt(0);
		System.out.println("Please enter a digit!");
		int b=input.nextInt();
		
		if (operator=='+') {
			System.out.println(a+b);
		}else if (operator=='*') {
			System.out.println(a*b);
		}else if (operator=='/') {
			System.out.println(a/b);
		}else if (operator=='-') {
			System.out.println(a-b);
		}
		
		
		
	}

}
