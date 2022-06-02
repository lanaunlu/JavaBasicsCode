package com.syntax.class02;

public class Homework2 {

	public static void main(String[] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program 
		//should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

		float a=3.0f;
		float b=2.0f;
		float add, sub, mult, div;
		
		add =a+b;
		sub =a-b;
		mult =a*b;
		div =a/b;
		
		System.out.println("The add of 2 numbers "+a+" and "+b+" is equal to "+add);
		System.out.println("The sub of 2 numbers "+a+" and "+b+" is equal to "+sub);
		System.out.println("The mult of 2 numbers "+a+" and "+b+" is equal to "+mult);
		System.out.println("The div of 2 numbers "+a+" and "+b+" is equal to "+div);
		
		// Write a program to find the square of the number 3.9. You program should say 
		//“The square of the ____ is ____ ”
		
		float number=3.9f;
		float square;
		square=number*number;
		
		System.out.println("The square of the "+number+" is "+square);
		
		//Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. 
		//Your program should say. 
		//“The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
		
		int width=6;
		int height=5;
		int total3=2*width+2*height;
		int total4=width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+total3+" and the area is "+total4);
		
		



	}

}
