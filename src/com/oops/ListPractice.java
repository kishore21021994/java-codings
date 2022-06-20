package com.oops;

import java.util.ArrayList;


import java.util.LinkedList;

import java.util.List;

public class ListPractice {
	
	public static void main(String[] args) {
		
		
		// List
		
		// Linked List
		
		List<Object> s1= new LinkedList <Object>();
		
		//add
		
		s1.add(23);
		
		s1.add(10);
		
		s1.add(15);
		
		s1.add("kishore");
		
		System.out.println(s1);
		
          List<Object> s2= new LinkedList <Object>();
		
		//add
		
		s2.add(23);
		
		s2.add(10);
		
		s2.add(15);
		
		s2.add("kishore");
		
		System.out.println(s2);
		
		
		// size()
		
//	int si=	s1.size();
//	
//	System.out.println(si);
//	
//	//get
//
//	Object ob =s1.get(2);
//	
//	System.out.println(ob);
//		
//		// set
//	
//	s1.set(1, "kishore");
//	
//	System.out.println(s1);
//	
	
		
		// Remove 
		
	//	s1.remove(1);
	//	
		System.out.println(s1);
	//	
		
		// Index of
		
	//	int io = s1.indexOf("kishore");
		
	//	System.out.println(io);
		
		// contains 
		
	//	boolean con = s1.contains(23);
		
	//System.out.println(con);
		
		//clear
		
	//	s1.clear();
		
	//	System.out.println(s1);
		
		
		// Add
		
	//	s1.addAll( s2);
		
	//	System.out.println(s1);
	
	//	retainall
		
	s1.retainAll(s2);
	
	System.out.println(s1);
	
	
	// removeall
	
	s1.removeAll(s2);
	
	System.out.println(s1);
	
	
		
		
		
	}

}
