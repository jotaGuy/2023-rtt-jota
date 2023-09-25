package controlflow;

import java.util.Scanner;

public class QuestionSix {
	public static void main(String[] args) {
		Scanner date = new Scanner(System.in);
		System.out.println("Enter a number 1 through 7");
		String day = date.nextLine();
		
		Boolean open = false;
		boolean close = true;

		int i = Integer.parseInt(day);

		switch (i) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday".length());
			break;
		case 5:
			System.out.println("Thursday".toUpperCase());
			break;
		case 6:
			System.out.println("Friday".toLowerCase());
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Out of Date Range");
			break;
		}
	}
}
