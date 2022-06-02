package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print even numbers from 20 to 100
		
		
		
		int a=20;
		
		while(a<=100) {
			System.out.print(a+" ");
			a+=2;
			}
		
		//Print only odd numbers from 100 to 1
		System.out.println();
		
		int b=99;
		
		while(b>=1) {
		System.out.print(b+" ");
		b-=2;
		}
		
		//other way
		System.out.println();
				
		int r=100;
				
		while (r>=1) {
					
			if (r % 2 !=0) {
						System.out.print(r + " ");
					}
					r--;
				}
		
	}

}
