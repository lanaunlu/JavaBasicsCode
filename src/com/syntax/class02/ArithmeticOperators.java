package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1=40;
		int num2=20;
		
		int sum, sub, mult, div;
		
		System.out.println(num1/num2);//2
		
		sum=num1+num2;
		System.out.println(sum);//60
		
		sub=num1-num2;
		System.out.println(sub);//20
		
		mult=num1*num2;
		System.out.println(mult);//800
		
		div=num1/num2;
		System.out.println(div);//2
		
		double num3=9.99;
		double num4=3.50;
		double sum1, sub1,mult1, div1;
		
		sum1=num3+num4;
		System.out.println(sum1);
		
		sub1=num3-num4;
		System.out.println(sub1);
		
		mult1=num3*num4;
		System.out.println(mult1);
		
		div1=num3/num4;
		System.out.println(div1);
		
		System.out.println(" ----------------- ");
		
		int a=10;
		int b=3;	
		int result=a/b;
		System.out.println(result);
		
		//int -> cuts the number, no decimals - 3
		
		double c=10;
		double d=3;	
		double result2=c/d;
		System.out.println(result2);
		
		//double -> will give you accuracy of up to double of float digits - 3.33333333333335 
		
		float e=10.0f;
		float f=3.0f;
		
		float result3=e/f;
		System.out.println(result3);
		
		//float -> will give you accuracy of up to 7 digits - 3.3333333
		
		
		
		
		
		
		
		
		
		

	}

}
