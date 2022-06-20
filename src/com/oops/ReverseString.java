package com.oops;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Cristiano Ronaldo";
		
		String ss= "";
		
		String Rs ="";
		
		for(int i = s.length()-1;i>=0;i--)
			
		{
			ss=ss+s.charAt(i);
			
		}
		
		Rs = ss+" ";
		
		System.out.println(s);
		
		System.out.println(Rs);
		
		
		
		
	}

}
