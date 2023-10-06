package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> stringSet = new HashSet<>();
		
		stringSet.add("A");
		stringSet.add("B");
		stringSet.add("C");
		
		for (String string : stringSet) {
			System.out.print(string);
		}

	}

}
