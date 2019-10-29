package programstatements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;






    public class Unparlimentary {
 

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = new String();
	
	public static void main(String[] args) throws IOException {
		
		Unparlimentary inwords = new Unparlimentary();
		String str = new String();
	 //Arraylist
		ArrayList<String> unparliamentaryarray = new ArrayList<String> ();
		unparliamentaryarray.add("coward");
		unparliamentaryarray.add("idiot");
		unparliamentaryarray.add("rat");
		unparliamentaryarray.add("double minded");
		unparliamentaryarray.add("bad man");
		System.out.println(unparliamentaryarray);
	//Write file
		
		  File simpleTextFile = new File("C:\\write\\AcceptableWords.txt"); 
		  FileWriter fileWriterObj = new FileWriter(simpleTextFile); 
		  BufferedWriter writeFile = new BufferedWriter(fileWriterObj);
		
		 
				
		
		 System.out.println("Please enter the word. (q to Quit)");
		 str = inwords.br.readLine();
		  
		  System.out.println("the word is " + str);
		 
		
		
		  do {
			  
			 if(unparliamentaryarray.contains(str)) {
				 
		  System.out.println("Enter the next word or q to quit");
		  str = inwords.br.readLine();
		       }
			  else {
		  writeFile.write(str);
		  writeFile.newLine();
		  System.out.println("Enter the word"); 
		  str = inwords.br.readLine();
		  } 
			
		  }while(!(str.equals("q")));
		  writeFile.close(); 
		  
		  
		  
}
    }
