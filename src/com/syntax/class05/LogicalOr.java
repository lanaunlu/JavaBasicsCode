package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {

		/*Monday and Friday --> No class
		 * Tuesday and Wednesday -> Manual Testing
		 * Thursday --> Review
		 * Saturday and Sunday --> Java
		 * 
		 * OR 
		 * true || true = TRUE
		 * true || false = TRUE
		 * false || true = TRUE
		 * false || false = FALSE
		 */
		
		String day="Monday";
		
		if(day.equals("Monday") || day.equals("Friday")){
			System.out.println("I have no class");
				
		}else if (day.equals("Tuesday") || day.equals("Wednesay")) {
			System.out.println("I have Manual Testing Class");
				
		}else if (day.equals("Thursday")){
			System.out.println("I have Review Class");
			
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}
		
		System.out.println("-------------");
		
		/*write a program to find largest number among three number using nested if,
		 * provided by a user (numbers must be distinct)
		 */
		
		int num1 = 20;
		int num2 = 10;
		int num3 = 22;
		
		if (num1 > num2 || num1 > num3){
			System.out.println("The largest number is " +num1);
			
		} else if (num3 > num1 || num2 > num3) {
			System.out.println("The largest number is " + num3);
			
		} else if (num2 > num1 || num2  > num3) {
				System.out.println("The largest number is " +num2);
			}
		
		}
	

}
