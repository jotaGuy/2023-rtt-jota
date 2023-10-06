package collections;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("Car");
		strings.add("Boat");
		strings.add("Bike");
		
		for(String string: strings) {
			System.out.println(string);
		}
		
		
		
		Iterator <String> itr = strings.iterator();
		
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.print(string);
		}
	}

}
