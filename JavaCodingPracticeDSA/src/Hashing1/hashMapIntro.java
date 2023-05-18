package Hashing1;
import java.util.*;

public class hashMapIntro {
	
	public static void main(String args[]) {
		HashMap<String,Integer> map= new HashMap<>();
		
		//Insert
		
		map.put("India", 120);
		map.put("US", 20);
		map.put("China", 220);
		
		System.out.println(map);
		
		//Change Value
		map.put("China", 180);
		System.out.println(map);
		
		// Search
		if(map.containsKey("Ihina")) {
			System.out.println("Present");
		}else System.out.println("Not Present");
		
		//Get a value of a key that exists 
		System.out.println(map.get("China"));
		
		//Get a value of a key that does not exists : prints null
		System.out.println(map.get("ihina"));
		
		//Iterate 
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.print(e.getKey()+":-");
			System.out.println(e.getValue());
		}
		//Second way
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		//remove
		map.remove("China");
		System.out.println(map);
		
	}

}
