/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of ArrayList
 */

package com.java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

public class SampleHashSet {

	public static void main(String[] args) {
		//getWindowHandles  ==> java.util.Set<java.lang.String> getWindowHandles()
		//getCookies		==> java.util.Set<Cookie> getCookies()
	      String planets[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
	      Set<String> solarSystem = new HashSet<String>();

	         for(int i = 0; i < 8; i++) {
	        	 solarSystem.add(planets[i]);
	         }
	         //System.out.println(solarSystem);
	         
	         solarSystem.forEach(planet -> {
	        	 System.out.println(planet);
	         });
	         Iterator planeto = solarSystem.iterator();
	         while(planeto.hasNext()){
	        	 System.out.println(planeto.next());
	        	 
	         }
	         
	}

}
