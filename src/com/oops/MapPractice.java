package com.oops;


import java.util.Collection;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	
	public static void main(String[] args) {
		
		
		//Map
		
		// HashMap
		
		Map<Integer,String> s= new LinkedHashMap<Integer,String>();
		
		// Put 
		
		s.put(12, "kishore");
		
		s.put(25,"bro" );
		
		s.put(36,"harris" );
		
		System.out.println(s);
		
		//Size
		
	int si=	s.size();
	
	System.out.println(si);
	
	// get()
	
	String ge =s.get(36);
	
	System.out.println(ge);
	
	//entryset()
	
	Set<Entry<Integer,String>>es=s.entrySet();
	
	System.out.println(es);
	
	
	//keyset
	
Set<Integer> ks=	s.keySet();
	
	System.out.println(ks);
	
	//value
	
	Collection<String> va =s.values();
	
	System.out.println(va);
	
	// ContainsKey()
	
	boolean con= s.containsKey(25);
	
	System.out.println(con);
	
boolean cv= 	s.containsValue("kishore");
	

System.out.println(cv);
	}
	
	

}
