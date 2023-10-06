package collections;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter a number please: ");
			int inputNumber = scanner.nextInt();
			System.out.println(inputNumber);
		} catch (Exception e) {
			System.out.println("We failed");
		} finally {
			System.out.println("Execute no matter what");
		}
	}

	public void readNumber() throws Exception {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a number please: ");
			int inputNumber = scanner.nextInt();
			System.out.println(inputNumber);
		} catch (Exception e) {
			System.out.println("We failed");
		} finally {
			System.out.println("Execute no matter what");
		}
	}

}
