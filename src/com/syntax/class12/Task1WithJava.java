package com.syntax.class12;

import java.util.Scanner;

public class Task1WithJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("To use this application please create a user name and password");
		String userName=input.next();
		System.out.println("Please create a password 8 Characters");
		String password=input.next();
		System.out.println("Please confirm password");
		String confirmPassword=input.next();
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty!");
		} else if (password.length()<8) {
			System.out.println("Password is too short.");
		} else if (password.contains(userName)) {
			System.out.println("Password cannot contain username");
		} else if (!password.equals(confirmPassword)) {
			System.out.println("Password do not match");
		} else {
			System.out.println("Your username and password has been created.");
			
		}
	}

}
