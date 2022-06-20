package com.oops;

public class StringAndFunctions {
	
	public static void main(String[] args) {
		
		String s= "Welcome To Java";
		
		// 1  s.length()
		
		int le =s.length();
		
		System.out.println(le);
				
		
		// 2   s.equals()
		
	boolean	eq = s.equals("Welcome To Java");   // Case sensitive
	
	System.out.println(eq);
	
	// 3   s.equalsIgnoreCase
	
	boolean eiq = s.equalsIgnoreCase("welcome to java");   // This is not a case sensitive
		
			System.out.println(eiq);
	
			
			// 4    s.toUpperCase()
			
			String uc =s.toUpperCase();
			
			System.out.println(uc);
			
			//5   s.toLowercase()
			
			String lc = s.toLowerCase();
			
			System.out.println(lc);
			
			
			//6   s.startswith()
			
			boolean sw =s.startsWith("Welcome");            // Case sensitive
			
			System.out.println(sw);
			
			// 7    s.endsWith()
			
		boolean	ew=s.endsWith("Java");      // Case sensitive 
		
		System.out.println(ew);
		
		// 8   s.contains()
		
		boolean con=s.contains("Welcome To Java");
		
		System.out.println();
		
		//  9    s.indexof()
		
		int io=s.indexOf("a");
		
		System.out.println(io);
		
		
		//10   s.lastIndexOf()
		
		int lio = s.lastIndexOf("e");
		
		System.out.println(lio);
			
	// 11   s.charAt()
		
		char ca = s.charAt(10);
		
		System.out.println(ca);
		
		//  12   s.replace()
		
		String re = s.replace("To", "2");
		
		System.out.println(re);
			
		// 13   s.isEmpty()
		
		boolean em=s.isEmpty();
		
		System.out.println(em);
		
		//  14   s.trim()
		
		System.out.println(s);
		
		String tr=s.trim();
		
		System.out.println(tr);
		
		// 15.s.substring()--------------- length based 
		
		// String ss =s.substring(6);
		
		// System.out.println(ss);

		   String ss=s.substring(3,12);
		
		  System.out.println(ss);
		  
		  // 16  s.split()
		  
		  String[] sp=s.split("To");
		  
		  for (String x : sp) {
			  
			  System.out.print(x);

		  }
		  
		  
		  
	}

}
