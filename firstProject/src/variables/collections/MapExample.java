package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> stringMap = new HashMap<>();
		
		stringMap.put("Michael Jordan", 38);
		stringMap.put("Lebron James", 32);
		
		//Integer firstPlayerScore = stringMap.get("Michael Jordan");
		
		//Integer secondPlayerScore = stringMap.get("Lebron James");
		
	
		for ( String key : stringMap.keySet()) {
			if (key == "Michael Jordan") {
				System.out.println(key + ": " + stringMap.get(key) + " points");
			}
		}
	}

}
