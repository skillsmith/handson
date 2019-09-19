/**
 * 
 */
package com.java.basics;

/**
 * @author SkillSmith
 * This class provides examples of primitive data types in Java
 */
public class WrapperClasses {

	static Byte smallestOneObj;
	static Short midSizeOneObj;
	static Integer mostWidelyUsedObj;
	static Long astronomicalQuantitiesObj;
	
	
	static Character aSingleCharacterObj;
	static Boolean sayTrueOrFalseObj;
	static String stringObj;
	static String userInputFromConsole;
	public static void main(String[] args) {
		
		smallestOneObj = 100;
		smallestOneObj = new Byte(smallestOneObj);
		smallestOneObj = Byte.parseByte("127");
		smallestOneObj.valueOf((byte) 100);
		System.out.println(stringObj.valueOf(smallestOneObj));
		
		
		midSizeOneObj = 10000;
		mostWidelyUsedObj = 1000000000;
		astronomicalQuantitiesObj = 1000000000000000000L;
		System.out.println(astronomicalQuantitiesObj.toString());
		aSingleCharacterObj = 'Z';		//P.S. notice the single quote
		aSingleCharacterObj = new Character('A');	//eqv. of aSingleCharacterObj = 'A' 
		aSingleCharacterObj = '\n';
		
		sayTrueOrFalseObj=true;
		sayTrueOrFalseObj=new Boolean(false); //eqv. of sayTrueOrFalseObj=false;
		
		int y=1000;
		System.out.println(returnSame(y));	//auto-boxing
		
	}
	
	private static int returnSame (Integer i){
		return i;	//unbox
	}
	
}