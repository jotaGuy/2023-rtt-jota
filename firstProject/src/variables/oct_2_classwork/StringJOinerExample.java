package oct_2_classwork;

import java.util.StringJoiner;

public class StringJOinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joinNames = new StringJoiner(", ", "[", "]");
		
		joinNames.add("Jancy");
		joinNames.add("Jancy-1");
		joinNames.add("Jancy-2");
		joinNames.add("Jancy-3");
		
		System.out.println(joinNames);
		}

}