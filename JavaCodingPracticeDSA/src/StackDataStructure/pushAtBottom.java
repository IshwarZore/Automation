package StackDataStructure;

import java.util.*;

public class pushAtBottom {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s= new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		//pushBottom(s,sc.nextInt());
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

	private static void pushBottom(Stack s,int x) {
		
		if(s.isEmpty()) {
			s.push(x);
			return;
		}
		
		int top = (int) s.pop();
		pushBottom(s, x);
		s.push(top);
		
	}
	
	private static void reverse(Stack<Integer> s) {
		
		if(s.isEmpty()) {
			return;
		}
		
		int top = (int) s.pop();
		reverse(s);
		pushBottom(s, top);
	
	}

}
