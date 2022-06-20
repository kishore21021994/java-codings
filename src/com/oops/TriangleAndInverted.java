package com.oops;

public class TriangleAndInverted {
	
	public static void main(String[] args) {
		
		
//		System.out.println("Triangle Code");
//		
//		System.out.println("---------------");
//		
//		System.out.println();
//		
//		for(int i=1;i<=10;i++)
//
//	{
//			for(int j=10;j>i;j--) {
//				
//				System.out.print("  ");
//				
//			}
//			
//			for(int j=1;j<=i;j++)
//				
//			{
//				System.out.print("*   ");
//		}
//			
//			System.out.println();
//	}
		
		
		// For Inverted 
		
		System.out.println("Inverted Triangle Code");
		
		System.out.println("---------------");
		
		System.out.println();
		
		int r =10;
		
		for(int i=r;i>=1;i--)
		{
			for(int j=r-i;j>=1;j--)
				
			{
				System.out.print("   ");
			}
			
			for(int k=1; k<=i;k++)
			{
				System.out.print("  *  ");
			}
			
			System.out.println( );
		}
	}

}
