package com.oops;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		
		// find thengiven number is odd or even
//		
//		int n=5;
//		
//		if(n%2==0) {
//			
//			System.out.println("it is even");
//			
//			
//		}else 
//			
//		{
//			System.out.println("it is odd");
//		} 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int number = sc.nextInt();
		
		if((number&1)==0)
			
		{
			
			System.out.println("Given Number is even");
			
			
			
		}
		
		else {
			System.out.println("Given number is odd");
		}
		
		}
}
