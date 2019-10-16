package programstatements;

/*{
"Mr. D'Souza went to 7/11 to buy beef jerky!"

In the above string, perform the following:
	1. Remove all the special characters
	2. find the position of beef
	3. replace "beef jerky" with "peanut butter"
	4. end the sentence with :-)

}*/


public class ExtractSpeacials {

	public static void main(String[] args) {
		String str1 = "Mr. D'Souza went to 7/11 to buy beef jerky!";
		String str2 = new String() ;
		
		str1 = str1.replaceAll("\\W"," "); 
			System.out.println(str1);
			
			System.out.println(str1.indexOf("beef"));
			str2=str1.replaceAll("beef jerky", "peanut butter");
			System.out.println(str2);
			
			StringBuilder str3= new StringBuilder(str2);
			System.out.println(str3.append(":-)"));
			
	}

}
