package com.oops;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner kia = new Scanner(System.in);
		
		System.out.println("Enter the Productname ;- ");
		
		String productname = kia.nextLine();
		
		System.out.println("Productname is :-   " + productname);
		
		System.out.println("Enter the Mrp :-");
		
		int mrp =kia.nextInt();
		
		System.out.println("Mrp is :-  "  +mrp);
		
		System.out.println("enter the Discount :-");
		
		float discount=kia.nextFloat();
		
		System.out.println("Discount is :-  " + discount);
		
		System.out.println("enter the grade ;-");

		char grade =kia.next().charAt(0);
		
		System.out.println("grade is :- "+ grade );
		
		System.out.println("enter the value in words ;-");
		
		String value =kia.next();
		
		System.out.println("value is :-" +value);
		
		
		
	}
}
