package StackDataStructure;

import java.util.*;


public class reverseAStack {
	
	static ArrayList<Integer> help = new ArrayList <>();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s= new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

	// alternate of this (which was taught by apna college is shown in the file pushAtBottom
	private static void reverse(Stack<Integer> s) {
		
		if(s.isEmpty()) {
			return;
		}
		
		help.add(s.pop());
		reverse(s);
		s.push(help.get(0));
		help.remove(0);
		
	}
	
}
