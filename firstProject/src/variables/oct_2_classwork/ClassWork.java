package oct_2_classwork;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum all numbers from 1 to 100;

		// question one
		int total = 0;

		for (int i = 1; i < 100; i++) {
			total += i;
			System.out.println(total);
		}
		System.out.println(total + " Done with ForLoop");

		// question 2

		// question two
		int total2 = 0;

		for (int i = 1; i < 100; i++) {
			total += i % 2;
			System.out.println(total);
		}
		System.out.println(total + " Done with ForLoop");
		
		//question three
				int total3 = 0;
				
				for (int i = 1; i < 100; i++) {
					total += i/2;
					System.out.println(total);
				}
				System.out.println(total + " Done with ForLoop");
	}

}
