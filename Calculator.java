package programstatements;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	
	char choice;
	int value1;
	int value2;
	String operation;
	float answer;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Calculator calculation = new Calculator();
		System.out.println("Select one of the operation");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multipxclication");
		System.out.println("Division");
		calculation.operation = calculation.br.readLine();
		System.out.println("the selected operation is "+ calculation.operation  );
        System.out.println("Please enter 'x' to quit, 'c' to continue");
        calculation.choice = (char) calculation.br.readLine().charAt(0);
        while (calculation.choice != 'x') {
        	System.out.println("Enter the first Value " );
        	calculation.value1 = Integer.parseInt(calculation.br.readLine());
        	System.out.println("Enter the second Value ");
        	calculation.value2 = Integer.parseInt(calculation.br.readLine());
       
        switch(calculation.operation) {
        case "Addition":
        	calculation.answer= calculation.value1 + calculation.value2;
        	System.out.println("The answer is "+ calculation.answer);
        	break;
        case "Subtraction":
        	calculation.answer= calculation.value1 - calculation.value2;
        	System.out.println("The answer is "+ calculation.answer);
        	break;
        case "Multiplication":
        	calculation.answer= calculation.value1 * calculation.value2;
        	System.out.println("The answer is "+ calculation.answer);
        	break;
        case "Division":
        	calculation.answer= calculation.value1 / calculation.value2;
        	System.out.println("The answer is "+ calculation.answer);
        	break;
        default:
            System.out.println("Operation is incorrect. Please check");
        	
        }
        System.out.println("Please enter 'x' to quit, 'c' to continue");
        calculation.choice = (char) calculation.br.readLine().charAt(0);
        
        }
        
        System.out.println("bye");
        
	}
	 
}
