package com.syntax.class06;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		  System.out.println("Please enter two strings");
		  String word1 = input.nextLine();
		  String word2 = input.nextLine();
		  System.out.println("Please enter two numbers");
		  int int1 = input.nextInt();
		  int int2 = input.nextInt();
		  if ((word1 == word2) && (int1 == int2)) {
		    System.out.println("AND");
		  }
			
		}
		
	}


