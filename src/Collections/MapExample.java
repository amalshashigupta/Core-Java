package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Map implementation using HashMap
HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
		
		System.out.println(map1);
		map1.put("Item3",300);
		System.out.println(map1);
		
	// find price of item4
		System.out.println("value of item no 4"+ map1.get("Item4"));
		
		// order doesn't matter in this
		
		

		// remove item2 from the map
		map1.remove("Item2");
		System.out.println(map1);

//iterate through map
		for(int value:map1.values()) {
			
			System.out.println("value is " + value);
		}
		
		for(String key:map1.keySet()) {
			
			System.out.println("The key is " + key);
			System.out.println("The value is " + map1.get(key));
		}


	}

}
