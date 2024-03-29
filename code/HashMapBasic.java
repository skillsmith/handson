/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of ArrayList
 */

package com.java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

public class HashMapBasic {

	public static void main(String[] args) {

			//The browser capabilities as a Map
			//public java.util.Map<java.lang.String,java.lang.Object> asMap()
			/*
			 * {
			 * ("Browser", "Chrome"),
			 * ("Browser Version", "72.1.0),
			 * ...
			 * 
			 * }
			 */
	         HashMap<Integer, String> emp = new HashMap<Integer, String>();
	         
	         // Put elements to the map
	         emp.put(1001, "Munna");
	         emp.put(1001, "Munna bhai");
	         emp.put(2002, "Munis");
	         emp.put(3003, "Umesh Bhadouria");
	         
	         //retrieve by key
	         System.out.println("Retrieve value for key 1001 " + emp.get(3003));
	         
	         for(Entry kvPair: emp.entrySet()){
	        	 System.out.println(kvPair.getKey() + ": " + kvPair.getValue());
	         }
	         emp.remove(2002);
	         for(Entry kvPair: emp.entrySet()){
	        	 System.out.println(kvPair.getKey() + ": " + kvPair.getValue());
	         }
	         
	         //Exists?
	         System.out.println("Does it contain ? " + emp.containsKey(2002));
	         System.out.println("Does it contain Munis " + emp.containsValue("Munis"));
	         
	         //Get all keys
	         for(int key : emp.keySet()){
	        	 System.out.println("Key " + key);
	         }
	         
	         
	         //Get all values
	         for(String name: emp.values()){
	        	 System.out.println("Name:" + name);
	         }
	         
	         
	         
	         emp.keySet().forEach(empID -> {
	         		System.out.println("Key by lambda " + empID);
	         });
	         
	}
}