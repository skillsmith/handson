package com.java.basics;

import java.time.LocalDateTime;
import java.util.Date;

public class StringClass {

	public static void main(String[] args) {

		String msg = " brave new  world!  ";
		
		//covert to upper case
		System.out.println(msg.toUpperCase());
		
		//convert to lower case again
		System.out.println(msg.toLowerCase());
		
		//trim it
		System.out.println(msg.trim());

		//check for the presence of 'new' word
		if(msg.contains("new")){
			System.out.println("yes, new is present");
			
		}

		//check if it starts with 'brave'
		if(msg.startsWith("brave")){
			System.out.println("yes, it starts with brave");
		}
		
		//check if it ends with 'world'
		if(msg.endsWith("world!")){
			System.out.println("yes, it ends with world");
		}
		
		
		String msgSave = new String (" brave new  world!  ");
		
		
		if(msg == msgSave){
			System.out.println("they are equal");
		}else{
			System.out.println("what a whata what?!");
		}

		if(msg.equals(msgSave)){
			System.out.println("whatever...they are equal");
		}
		
		String numeroStringified_1 = 100 + "";				//for me
		String numeroStringified_2 = Integer.toString(100);	//for die-hards!
		int parsedInteger = Integer.parseInt("100");
		
		StringBuilder concatShort= new StringBuilder();

		for (short i=1; i<=1000;i++){
			concatShort.append(Short.toString(i) + "\n");
		}
		//System.out.println(concatShort.toString());

		String concatShortString= null;
		for (short i=1; i<=1000;i++){
			concatShortString = concatShortString + Short.toString(i) + "\n";
		}
		System.out.println(concatShortString);
		
		
	}
}