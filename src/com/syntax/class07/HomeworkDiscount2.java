package com.syntax.class07;

import java.util.Scanner;

public class HomeworkDiscount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale today? Please enter yes or no.");
		String sale = scan.next();
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What item do you want to buy?");
			String item = scan.next();
			System.out.println("What is the price of the item?");
			double price = scan.nextDouble();
			String shop;
			String discount;
			double total;
			if (price < 20) {
				shop = "Okay, you get a 10% discount.";
				discount = "10%";
				total = price - (price * .10);
			} else if (price >= 20 && price <= 100) {
				shop = "Okay, you get a 20% discount.";
				discount = "20%";
				total = price - (price * .20);
			} else if (price >= 100 && price <= 500) {
				shop = "Okay, you get a 30% discount.";
				discount = "30%";
				total = price - (price * .30);
			} else {
				shop = "Okay, you get a 50% discount.";
				discount = "50%";
				total = price - (price * .50);
			}
			System.out.println(shop);
			System.out.println("After the discount of " + discount + ", the " + "price of the item is reduced from "
					+ price + " to " + total + " dollars.");
			
		} else {
			System.out.println("You will not be shopping today. Please shop another day!");
			
		}
	}

}
