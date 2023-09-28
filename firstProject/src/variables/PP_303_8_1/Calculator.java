package PP_303_8_1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter first number: ");
		
		int firstNumber = input.nextInt();
		input.nextLine();
		
		System.out.println("Please enter second number: ");
		
		int secondNumber = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter the type of operation you want to perform (+, -, *, /): ");
		
		String operation = input.next();
		
		c.menu(firstNumber, secondNumber, operation);
	}

	public void menu(int firstNumber, int secondNumber, String operation) {
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
        
        System.out.print(result);
		
	}

}
