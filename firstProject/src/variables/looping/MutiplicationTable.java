package looping;

public class MutiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;

		while (number <= 12) {
			System.out.print("\n");
			for (int i = 1; i <= 12; i++) {
				System.out.print(number * i + "\t");
			}
			number = number + 1;
		}
	}

}
