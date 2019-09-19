<<<<<<< HEAD
/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * Sample snippet for Java primitives
 */

package com.java.basics;


public class PrimitiveDataTypes {

	public static void main(String[] args) {

		byte doesNotBite = 0; short takeThisShot; int intEger; long longInt;
		float floatOnWaters; double doublePrecision;
		boolean boolBooliah; char characterS;
	
		try{
			doesNotBite = -128;
			takeThisShot = 32_767; //1,000,000
			intEger	= -2_147_483_648;
			longInt = 9223372L;
			floatOnWaters = 3.14f;
			doublePrecision = 2.0e5D; 
			boolBooliah = true;
			characterS = '\u00A7';

			System.out.println("The value of doesNotBite is " + doesNotBite);
			System.out.println("The value of takeThisShot is " + takeThisShot);
			System.out.println("The value of intEger is " + intEger);
			System.out.println("The value of longInt is " + longInt);
			System.out.println("The value of floatOnWaters is " + floatOnWaters);
			System.out.println("The value of doublePrecision is " + doublePrecision);
			System.out.println("The value of boolBooliah is " + boolBooliah);
			System.out.println("The value of characterS is " + characterS);

			
		} // try block ends here
		catch (NumberFormatException exception){
			System.out.println ("Please provide the correct value");
		} // catch block ends here
		
	}

}
=======
/**
 * Copyright 2019 Bluefox Technologies Inc.
 * @author SkillSmithy
 * Sample snippet for Java primitives
 */

package com.java.basics;


public class PrimitiveDataTypes {

	public static void main(String[] args) {

		byte doesNotBite = 0; short takeThisShot; int intEger; long longInt;
		float floatOnWaters; double doublePrecision;
		boolean boolBooliah; char characterS;
	
		try{
			doesNotBite = -128;
			takeThisShot = 32_767; //1,000,000
			intEger	= -2_147_483_648;
			longInt = 9223372L;
			floatOnWaters = 3.14f;
			doublePrecision = 2.0e5D; 
			boolBooliah = true;
			characterS = '\u00A7';

			System.out.println("The value of doesNotBite is " + doesNotBite);
			System.out.println("The value of takeThisShot is " + takeThisShot);
			System.out.println("The value of intEger is " + intEger);
			System.out.println("The value of longInt is " + longInt);
			System.out.println("The value of floatOnWaters is " + floatOnWaters);
			System.out.println("The value of doublePrecision is " + doublePrecision);
			System.out.println("The value of boolBooliah is " + boolBooliah);
			System.out.println("The value of characterS is " + characterS);

			
		} // try block ends here
		catch (NumberFormatException exception){
			System.out.println ("Please provide the correct value");
		} // catch block ends here
		
	}

}
>>>>>>> 861e6af60c041363de0a919dbea8971026ac5017
