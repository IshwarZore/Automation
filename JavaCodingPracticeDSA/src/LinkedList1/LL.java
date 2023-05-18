package LinkedList1;

import java.util.LinkedList;

import LinkedList1.LL.Node;

public class LL {
	
	static Node head = null;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data= data;
			this.next= null;
		}
	}
	
	//add first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head= newNode;
			return;
		}
		 newNode.next=head;
		 head=newNode;
	}
	
    // add Last
	public void addLast(String data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head= newNode;
			return;
		}
		 
		Node currentNode = head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"->");
			currentNode=currentNode.next;
		}
		System.out.println("NULL");
		
	}
	
	//delete first
	public void removeFirst() {
		if(head==null) {
			System.out.print("List is empty");
			return;
		}
		head=head.next;
	}
	//delete last
	public void removeLast() {
		if(head==null) {
			System.out.print("List is empty");
			return;
		}
		 
		if(head.next==null) {
			head=null;
		}
		Node currentNode = head;
		while(currentNode.next.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=null;
		
	}
	
	public int size() {
		
		if(head==null) {
			return 0;
		}
		int count = 1;
		Node currentNode = head;
		while(currentNode.next!=null) {
			count++;
			currentNode=currentNode.next;
		}
		return count;
	}
	
	public void reverseIterate() {
		
		if(head==null || head.next==null) {
			return;
		}
		/*if(head.next==null) {
			return;
		}*/
		
		Node prev= head;
		Node curr= prev.next;
		
		while(curr!=null) {
			Node next=curr.next;
			curr.next= prev;
			prev=curr;
			curr=next;
			
		}
		
		head.next=null;
		head=prev;
		
	}
	
	public Node reverseRecurssion(Node head) {
		if(head==null|| head.next==null) {
			return head;
		}
		
		Node newHead=reverseRecurssion(head.next);
		
		head.next.next=head;
		head.next=null;
		
		return newHead;
		
	}
	
	public void findAndDeleteNNode(int n) {
		if(head==null) {
			return ;
		}
		
		Node prev=null;
		Node currNode = head;
		for(int i=1;i<n;i++) {
			prev= currNode;
			currNode=currNode.next;
		}
		
		if(currNode==head) {
			System.out.println("The Nth Node is ["+currNode.data+"]");
			head=currNode.next;
			return;
		}
		
		//Node next= currNode.next;
		System.out.println("The Nth Node is ["+currNode.data+"]");
		prev.next=currNode.next;
		
		currNode.next=null;
	}
	
	
	public static void main(String arg[]) {
		
		//directApproch
		
		LinkedList<String> list1= new LinkedList<String>();
		list1.addFirst("is");
		list1.addLast("a");
		list1.addFirst("this");
		list1.addLast("List");
		System.out.println(list1);
		System.out.println(list1.size());
		list1.remove(3);
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
		list1.removeFirst();
		System.out.println(list1);

		
		
		 
		//Self made
		LL list = new LL();
		list.addFirst("is");
		list.addLast("a");
		list.addFirst("this");
		list.addLast("List");
		list.printList();
		/*System.out.println(list.size());
		list.removeLast();
		list.printList();
		System.out.println(list.size());
		list.removeFirst();
		list.printList();
		System.out.println(list.size());
		*/
		list.reverseIterate();
		list.printList();
		head=list.reverseRecurssion(head);
		list.printList();
	}
	
}
