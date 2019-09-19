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

public class SampleArrayList {

	public static void main(String[] args) {

		//findElements ==> java.util.List<WebElement> findElements(By by)
		
		String str = new String();
		ArrayList<String> specimenCharacters = new ArrayList<String> ();
				
		str = "hullabaloo";
		specimenCharacters.add(str);			//put an element into the array list; do NOT care which position to place
		str = "rabblerouser";
		specimenCharacters.add(1, str);		//put an element into the array list at a specific location
		
		for (String character : specimenCharacters){
			System.out.println(character + " \n");
		}
		System.out.println("--------------------------------------------------- \n");
		str = "trouble maker";
		specimenCharacters.add(0, str);		//put another element into the array list at a location where another obj already resides
		for (String character : specimenCharacters){
			System.out.println(character + " \n");
		}
		System.out.println("--------------------------------------------------- \n");
		specimenCharacters.remove(1);		//don't like, let us get rid of hullabaloo
		for (String character : specimenCharacters){
			System.out.println(character + " \n");
		}
		System.out.println("Now the size of the array list is " + specimenCharacters.size()); //find the length of the array list
		System.out.println("--------------------------------------------------- \n");		
		System.out.println(specimenCharacters.get(1));		//fetch an object at a specific location
		
		//assert arrayList.contains(str) : arrayList.remove(str);		//if you exist I will get rid of you! 
		System.out.println(specimenCharacters.contains(str));
		specimenCharacters.remove(str);		//don't like, let us get rid of 
		specimenCharacters.remove(0);	
		System.out.println("Is that we got rid of all objects in the array list? " + specimenCharacters.isEmpty());
	}
}