package com.oops;

public class StringTypesImmutable {
	
	public static void main(String[] args) {
		
		
		// To find particular memory address . there is a method 
		
		// system.identityHashcode(args)
		
	//  	IMMUTABLE STRING
		
		
		String s1= "Kishore";   // original value 
		
		String s2="Kishore";    // Duplicate value , Memory is shared 
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1+s2);
		
		System.out.println(System.identityHashCode(s1+s2)); // New memory created 
		
		
		
	}

}
