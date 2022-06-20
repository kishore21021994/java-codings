package com.oops;

import java.util.Scanner;

public class ConditionStatement {
	
	public static void main(String[] args) {
		
		
		// if statement 
		
	//	 if (10>2) {
			
	//	 	System.out.println("it is true ");
 	 //   }

		
	//	if else statement
		
		
//	//	if(10>90)
//			
//		{
//			System.out.println("it is true ");
//			
//		}else {
//			
//			System.out.println("it is false");
//		}
//		
	//   if else if ladder statement	
		
		// && ----------- AND Operator
		
		//  || ---------- OR Operator
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enetr Your Mark");
		
		
		
		int mark =sc.nextInt();
		
		
		if(mark<50) {
			
			System.out.println("D garde");
			
		}
		
		else if (mark>=50 && mark<60) {
			
			System.out.println("C Grade");
		}
		else if (mark>=60  && mark<80) {
			
			System.out.println("B Grade");
		}
		
		else if (mark>=80  && mark<=100) {
			
			System.out.println("A Grade");
		
		}else {
			
			System.out.println("Invalid");
		}
	
	}
	
	
	
}