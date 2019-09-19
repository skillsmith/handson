<<<<<<< HEAD
/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of arrays
 */
package com.java.basics;

public class ArraysBasic {

	byte smallestOne=100;
	byte[] manySmalls = new byte[10];
	
	char[] charcters = {'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
	char[] name = new char[5];
	
	public static void main(String[] args) {
		ArraysBasic obj = new ArraysBasic();


		obj.manySmalls[0]=10;	//PS. zero-indexed. Position in the carton box counted from 0 (ZERO)
		obj.manySmalls[9]=100;	//by above last position is always always size minus 1
		
		System.out.println("First charcter in characters array is "+obj.charcters[0]);

		for(int counter=0; counter<obj.charcters.length;counter++){
			System.out.print(counter);
			System.out.print(obj.charcters[counter]);
			System.out.println("");
		}
		
		obj.name[0]='U';
		obj.name[1]='m';
		obj.name[2]='e';
		obj.name[3]='s';
		obj.name[4]='h';
		for(int counter=0; counter<obj.name.length;counter++){
			System.out.println(obj.name[counter]);
		}
		/*
		 * for each item in array
		 * 		do this
		 */
		for (char smaLL : obj.charcters){
			System.out.print(smaLL); //printed
			//also add the number ==> cumulative sum
		}
		
	}
=======
/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * An example of arrays
 */
package com.java.basics;

public class ArraysBasic {

	byte smallestOne=100;
	byte[] manySmalls = new byte[10];
	
	char[] charcters = {'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
	char[] name = new char[5];
	
	public static void main(String[] args) {
		ArraysBasic obj = new ArraysBasic();


		obj.manySmalls[0]=10;	//PS. zero-indexed. Position in the carton box counted from 0 (ZERO)
		obj.manySmalls[9]=100;	//by above last position is always always size minus 1
		
		System.out.println("First charcter in characters array is "+obj.charcters[0]);

		for(int counter=0; counter<obj.charcters.length;counter++){
			System.out.print(counter);
			System.out.print(obj.charcters[counter]);
			System.out.println("");
		}
		
		obj.name[0]='U';
		obj.name[1]='m';
		obj.name[2]='e';
		obj.name[3]='s';
		obj.name[4]='h';
		for(int counter=0; counter<obj.name.length;counter++){
			System.out.println(obj.name[counter]);
		}
		/*
		 * for each item in array
		 * 		do this
		 */
		for (char smaLL : obj.charcters){
			System.out.print(smaLL); //printed
			//also add the number ==> cumulative sum
		}
		
	}
>>>>>>> 861e6af60c041363de0a919dbea8971026ac5017
}