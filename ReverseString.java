package com.java.basics;

public class ReverseString {

	public static void main(String[] args) {
		String toReverse="abc";		//5 is the length of the string
										//
		System.out.println("To reverse " + toReverse);
		char[] reversedChars = new char[toReverse.length()];
		
		for (int position=toReverse.length()-1; position >= 0; position--){
			reversedChars[toReverse.length()-1-position] = toReverse.charAt(position);
		}
		
		String reversedString = new String(reversedChars);
		System.out.println("Reversed " + reversedString);

		
		StringBuilder string2Reverse = new StringBuilder(reversedString);
		string2Reverse.reverse();
		System.out.println("Reversed back with String Builder " + string2Reverse);

		string2Reverse.append(" world!");
		System.out.println(string2Reverse);
		string2Reverse.deleteCharAt(string2Reverse.length() -1);
		System.out.println(string2Reverse);
		string2Reverse.append("!");
		System.out.println(string2Reverse);
		string2Reverse.deleteCharAt(string2Reverse.indexOf("!"));
		System.out.println(string2Reverse);
		System.out.println(string2Reverse.length());
		
		StringBuffer bufferedString = new StringBuffer(string2Reverse);
		bufferedString.reverse();
		System.out.println("Reversed again with String Buffer " + bufferedString);
	}

}
