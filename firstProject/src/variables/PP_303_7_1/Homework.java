package PP_303_7_1;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "This is an example!";
		
		// find position of the last space in string
		int lastSpace = example.lastIndexOf(" ");		
		//System.out.println(lastSpace);
		
		//substring of the characters between the first and last space of string
		String substring = example.substring(example.indexOf(" ") + 1, example.lastIndexOf(" "));
		//System.out.println(substring);
		
		//find the substring of the first and last vowel of the string
		
		
		// use the string.charAt function and use a for loop to loop over the entire string
		// and print out each character with a new line after it.
		// you need to use the string.length() function also
		
		for (int pos = 0; pos < example.length(); pos ++) {
			System.out.println(example.charAt(pos));
		}
		
		//using only indexOf(" ") print the substring that contains the word is
		//System.out.println(example.substring(example.indexOf(" ") + 1, example.indexOf("a")));
		
		System.out.print(5 / 2);
	}
	

}
