package com.syntax.class07;

import java.util.Scanner;

public class HomeworkLanguagesTwo {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Country:");
		String country, lang;
		country = input.nextLine();
		
		switch (country) {
		
		case "South Africa":	lang="Afrikaans";	break;
		case "England":			lang="English";		break;
		case "Turkey":			lang="Turkish";		break;
		case "France":			lang="French";		break;
		default:				lang="Unknown";
		}
			System.out.println("Your language is "+lang);
		
	}

}
