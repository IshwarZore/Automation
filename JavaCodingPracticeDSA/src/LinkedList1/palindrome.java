package LinkedList1;

import java.util.Scanner;

import LinkedList1.LL.*;

public class palindrome {
	
	static Node head = null;
	
	public static void main(String arg[]) {
		LL list = new LL();
		list.addFirst("is");
		list.addLast("a");
		list.addFirst("this");
		list.addLast("List");
		list.printList();
		System.out.print(isAPelindrome(head,list.size()));
		
	
	}

	private static boolean isAPelindrome(Node trueHead,int n) {
		if(trueHead==null || trueHead.next==null) {
			return true;
		}
		
		Node middleNode= divide(trueHead,n);
		Node secondHead= reverse(middleNode.next);
		Node firstHead= trueHead;
		while(secondHead!=null) {
			if(!(secondHead.data.equalsIgnoreCase(firstHead.data))) {
				return false;
			}
			System.out.print(secondHead.data.equalsIgnoreCase(firstHead.data));
			secondHead=secondHead.next;
			firstHead=firstHead.next;
		}
		
		return true;
		
		
	}

	private static Node reverse(Node secondHead) {
		if(secondHead==null || secondHead.next==null) {
			return secondHead;
		}
		
		Node newHead=reverse(secondHead.next);
		secondHead.next.next=secondHead;
		secondHead.next=null;
		return newHead;
		
	}

	private static Node divide(Node trueHead,int n) {
		
		Node middleNode=trueHead;
		for(int i=1;i<=n/2;i++) {
			middleNode=middleNode.next;
		}
		
		return middleNode;
	}

}
