package com.oops;

public class ThisChild extends ThisSuperKeyword {
	
	int a=66;
	
	public void num2() {

		System.out.println(a);
		
		
	}
	
	public void num() {

		super.num();
		
		this.num2();   // invoke
		
		
	}

	public static void main(String[] args) {
		
		
		ThisChild obj1 = new ThisChild();
		
		obj1.num();
		
		
		
	}
}
