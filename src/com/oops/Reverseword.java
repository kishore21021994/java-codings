package com.oops;

public class Reverseword {

	public static void main(String[] args) {

		String s = "number seven";
		
	String[] sp  =	s.split(" ");
	
	String Rs="";
	
	for(int i=0;i<sp.length;i++)
		
	{
		String word =sp[i];
		
		String RW="";
		
		for (int k =word.length()-1;k>=0;k--) {
			
			RW=RW+word.charAt(k);
		}
		
		Rs=Rs+RW+" ";
		
		System.out.println(s);
		
		System.out.println(Rs);
			
	}
		
	}

}
