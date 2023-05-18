package LinkedList1;

import java.util.Scanner;

import LinkedList1.LL.Node;

public class findAndDeleteNthNode {
	
	//find and delete nth node from last
	
	static Node head = null;
	
	
	
	public static void main(String arg[]) {
		LL list = new LL();
		list.addFirst("is");
		list.addLast("a");
		list.addFirst("this");
		list.addLast("List");
		list.printList();
		Scanner sc = new Scanner(System.in);
		int n = (list.size()- sc.nextInt())+1;
		list.findAndDeleteNNode(n);
		list.printList();
	
	}
    
}
