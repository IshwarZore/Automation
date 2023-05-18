package Syntax;

import java.util.HashMap;

public class syntax {
	
	public static void main(String args[]) {
		
		
		// String Builder
		StringBuilder sb= new StringBuilder("Tony");
		sb.charAt(0); 
		sb.deleteCharAt(0);
		sb.setCharAt(0, 'P'); //replaces the element at that index
		sb.insert(0, 'S');   //pushes that element further and takes its position
		int start=0;
		int end=1;
		sb.delete(start, end); //start is inclusive and end is non inclusive
		sb.append(" Stark"); //Adds
		sb.length();
		
		// Exceptional Map Syntax
		HashMap<Integer,Integer> map= new HashMap<>();
		int frequncy = map.getOrDefault(10, 0) +1 ; // if key 10 is present then it will return its value
		// or else it will return 0; // was used in Maximum Frequence Stack sum leetcode
	
	}	
}
