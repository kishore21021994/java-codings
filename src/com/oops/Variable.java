package com.oops;

public class Variable {

	int b=234;   // class variable 
	
	static int c =22;   // static variable  in class
	
	
	
	public void localvariable() {

		int b =10;  //local variable 
		
		System.out.println(b);
		
	} 
	
	public static void number() {   // static variable in method 
		
		System.out.println("kishore");
	}
	
	public static void main(String[] args) {
		
		Variable obj = new Variable();
		
		
		obj.localvariable();
		
		System.out.println(c);
		
		number();
		
	}
}
