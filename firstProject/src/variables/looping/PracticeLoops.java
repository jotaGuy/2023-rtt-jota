package looping;

public class PracticeLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		double goal = 20000;

		int year = 0;

		while (tuition < goal) {
			tuition = tuition * 1.07;
			year = year + 1;
		}
		System.out.print(year);
	}
}
