package com.syntax.class07;

import java.util.Scanner;

public class HomeworkLanguages {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Where are you from");
		String country=user.next();
		String lang;
		
		if(country.equalsIgnoreCase("South Africa")) {
			lang="Afrikaans";
		}else if(country.equalsIgnoreCase("England")) {
			lang="English";
		}else if(country.equalsIgnoreCase("Turkey")) {
			lang="Turkish";
		}else if(country.equalsIgnoreCase("France")) {
			lang="French";
			
			System.out.println("You speak "+lang);
			
		
		
		
		}

	
	}

}
