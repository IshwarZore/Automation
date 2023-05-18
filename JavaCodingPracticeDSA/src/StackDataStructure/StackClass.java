package StackDataStructure;

import java.util.*;

public class StackClass {
	
public static void main(String args[]) {
		
	Stack<Integer> s= new Stack<>();
		//Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	
		
		// Linked list
		/*static class Node{
			int data;
			Node next;
			public Node(int data) {
				this.data=data;
				this.next=null;
			}
		}
		
		static class Stack{
			static Node head;
			
			public static boolean isEmpty(){
				if (head==null) {
					return true;
				}else return false;
			}
			
			
			public static void push(int data) {
				Node newNode= new Node(data);
				if(isEmpty()) {
					head=newNode;
				}else {
					newNode.next=head;
					head=newNode;
				}
			}
			
			public static int pop() {
				if(isEmpty()) {
					return -1;
				}
				
				
				int top = head.data;
				head= head.next;
				return top;
			}
			
			public static int peek() {
				if(isEmpty()) {
					return -1;
				}
				return head.data;
			}
		}*/	
	
	
	
	/* Array List
	static class Stack{
		static ArrayList<Integer> list =new ArrayList<>(); 
		
		public static boolean isEmpty() {
			return list.size()==0;
		}
		
		public static void push(int data) {
			list.add(data);
		}
		
		public static int pop() {
			
			if(isEmpty()) {
				return -1;
			}
			
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		public static int peek() {
			
			if(isEmpty()) {
				return -1;
			}

			return list.get(list.size()-1);
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	Maximum Frequence Stack :  Leet Code
	//the following was my fist attempt but some test cases were'nt running
	// optimised solution on leetcode & internet
	 * whenever Frequency is used USE HASHMAP
	 * 
	  HashMap<Integer, Integer> fmap;
    List<Stack<Integer>> stack;

    public FreqStack() {
        fmap = new HashMap();
        stack = new ArrayList();
        stack.add(new Stack());
    }

    public void push(int x) {
        int freq = fmap.getOrDefault(x, 0) + 1;
        fmap.put(x, freq);
        if (freq == stack.size()) stack.add(new Stack());
        stack.get(freq).add(x);
    }

    public int pop() {
        Stack<Integer> top = stack.get(stack.size()-1);
        int x = top.pop();
        if (top.size() == 0) stack.remove(stack.size()-1);
        fmap.put(x, fmap.get(x) - 1);
        return x;
    }
	
	*/

		
	}

}
