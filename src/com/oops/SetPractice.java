package com.oops;

import java.util.HashSet;


import java.util.LinkedHashSet;


import java.util.Set;


public class SetPractice {
	
	public static void main(String[] args) {
		
		//set 
		
		// Hashset
		
		Set<Integer>s1=new HashSet<Integer>();
		
		s1.add(25);
		
		s1.add(36);
		
		s1.add(97);
		
		System.out.println(s1);
		
		
		// Linked Hashset
		
//		Set<Integer>s2=new LinkedHashSet<Integer>();
//		
//		s2.add(25);
//		
//		s2.add(36);
//		
//		s2.add(97);
//		
//		System.out.println(s2);
		
		
		// Treeset
		
//		Set<Integer>s3=new TreeSet<Integer>();
//		
//		s3.add(25);
//		
//		s3.add(36);
//		
//		s3.add(97);
//		
//		System.out.println(s1);
//		
		//Size()
		
	int si=	s1.size();
	
	System.out.println(si);
	
	// contains()
	
	boolean con =s1.contains(25);
	
	System.out.println(con);
	
	//addAll()
	
	Set<Integer>s2=new HashSet<Integer>();
	
	s2.add(2500);
	
	s2.add(3600);
	
	s2.add(9700);
	
	System.out.println(s2);

	s1.addAll(s2);
	
	System.out.println(s1);
	
	
	//clear
	
	s1.clear();
	
	System.out.println(s1);
	
	//empty
	
boolean em=s1.isEmpty();
	
	System.out.println(em);
	
	// retainall
	
	s1.retainAll(s2);
	
	System.out.println(s1);
		
	
	//removeall
	
	s1.remove(s2);
	
	System.out.println(s1);
	
	
	}

}
