package com.syntax.class14;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str="asdasd132546!@#";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
	}

}
