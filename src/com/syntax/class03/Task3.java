package com.syntax.class03;

public class Task3 {

	public static void main(String[] args) {
		
		int a=100;
		a+=500;
		a+=200;
		
		System.out.println(a);
		
		a+=200;
		System.out.println(a);
		
		a-=60;
		System.out.println(a);
		
		System.out.println(" -------------------- ");
		
		/*
		 * Declare variable cakePiece=11
		 * and divide the value of that variable 
		 * between 4 people using shorthand operator
		 */
		
		int cakePiece=11;
		
		cakePiece/=4;
		System.out.println(cakePiece);
		
		/*
		 * Declare variable cake=25 and divide cake between 7 people.
		 * Using shorthand operator, find out how many pieces of cake are 
		 * left after it was distributed equally among 7 people
		 */
		
		int cake=25;
		System.out.println(cake/7);
		cake%=7;
		System.out.println(cake);
		
		

	}

}
