package com.oops;

public class Mutable {
	
	public static void main(String[] args) {
		
//		/// String Buffer 
//		
//		StringBuffer s1=new StringBuffer("Kishore");
//		
//		StringBuffer s2= new StringBuffer("Kishore");  /// new memory is creating 
//				
//				System.out.println(System.identityHashCode(s1));
//		
//		
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s1.append(s2));// memory is shared 
//		
//		System.out.println(System.identityHashCode(s1.append(s2)));
//		
		
		
		// Sring Builder
		
		StringBuilder s1= new StringBuilder("Kishore");
		
		StringBuilder s2= new StringBuilder("Kishore");   // new memory created due to kuyword "new"
		
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1.append(s2));   //  Memory shared by suffix of operating keyword 
		
		System.out.println(System.identityHashCode(s1.append(s2)));
		
		
	}

}
