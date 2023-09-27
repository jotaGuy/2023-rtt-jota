package Arrays;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5, 7.0 };

		double min = numbers[0];
		double max = numbers[0];

		for (double number : numbers) {
			if (min > number) {
				min = number;
			}
			if (max < number) {
				max = number;
			}
		}
		System.out.println("This is Min: " + min);
		System.out.println("This is Max: " + max);

		String[] stringArray = { "a", "b", null, "d", "e", null };

		int notNullCount = 0;

		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] != null) {
				notNullCount = notNullCount + 1;
			}
		}

		int notNullCountEnhanced = 0;

		for (String value : stringArray) {
			if (value != null) {
				notNullCountEnhanced = notNullCountEnhanced + 1;
			}
		}
	}

}
