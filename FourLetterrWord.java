package programstatements;

/*Accept one letter at a time of the word from the user and put it into a char array. Check for the presence of letters

	1. a or e, print bing!
	2. s and n, print sing!
	3. p and i, print ping
	4. none of the above satisfied, print ding!
}
*/



public class FourLetterrWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asne";
		char charArray[] = new char[4];
		str.getChars(0, 4, charArray, 0);
		
		for (int i=0;i<charArray.length-1;i++) {
			if(charArray[i] =='a'|| charArray[i]=='e' ) {
		System.out.println("bing!");
			}
			else if(charArray[i] =='s' && charArray[i+1]=='n') {
				System.out.println("sing!");				
			}
			else if(charArray[i] =='p' && charArray[i+1]=='i') {
				System.out.println("ping!");	
			}
			else {
				System.out.println("ding!");
			}
	}
	}
	}

