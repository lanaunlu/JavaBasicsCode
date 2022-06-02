package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry"};
		
		System.out.println(disney[1]); //Elsa
		
		System.out.println("All elements using regular for loop --------");
		
		//to get all elements from an array
		
		for(int i=0; i<disney.length; i++) {	
			System.out.print(disney[i]+" ");
			
			if(disney[i].equalsIgnoreCase("Shrek")) {
				System.out.println(disney[i].equalsIgnoreCase("Shrek"));
			}
		}
		
		System.out.println("All elements using regular for loop ---------");
		
		for(String character:disney) {
			
			if(character.equalsIgnoreCase("Mulan")) {
				continue;
			} else {
				System.out.println(character + " ");
			}
			
			System.out.print(character+" ");
		}
	}

}
