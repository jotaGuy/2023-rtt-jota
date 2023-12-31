package PP_303_8_1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		Scanner input = new Scanner (System.in);
		
		// asking for first number
		System.out.println("Please enter first number: ");
		
		// if input not an integer ask again	
		while(!input.hasNextInt()) {
		    input.next();
		    System.out.println("Please a number: ");
		}
		int firstNumber = input.nextInt();
		input.nextLine();
		
		// asking for second number	
		System.out.println("Please enter second number: ");
		
		
		// if input not an integer ask again
		while(!input.hasNextInt()) {
		    input.next();
		    System.out.println("Please a number: ");
		}
		
		int secondNumber = input.nextInt();
		input.nextLine();
		
		// asking for a operator
		System.out.print("Enter the type of operation you want to perform (+, -, *, /): ");		
		String[] operand = {"+", "-", "*", "/"};
				
		String operation = input.next();
		
		int result = c.calculate(firstNumber, secondNumber, operation);
		
		System.out.print(result);
	}

	
	public int calculate(int firstNumber, int secondNumber, String operation) {
		int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        
        return result;
		
	}

}
