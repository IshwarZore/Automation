 package Queue1;



public class queueUsingLinkedList {
	
	public static void main(String args[]) {
		
		
		
		// self made
		Queue q= new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.printList();
		q.remove();
		q.printList();
	}
	
	
	static class Queue{
		static Node tail=null;
		static Node head= null;
		
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
		
		public static void add(int data) {
			Node newNode= new Node(data);
			if(head==null) {
				head= newNode;
				tail=newNode;
				return;
			}
			tail.next=newNode;
			tail=newNode;
		}
		
		//delete first
		public int remove() {
			if(head==null) {
				System.out.print("List is empty");
				return -1;
			}
			if(head.next==null) {
				int front=head.data;
				head=tail=null;
				return front;
			}
			int front=head.data;
			head=head.next;
			return front;
		}
		
		public int peek() {
			if(head==null) {
				System.out.print("List is empty");
				return -1;
			}
			return head.data;
		}
		
		public void printList() {
			if(head==null) {
				System.out.println("List is empty");
				return;
			}
			
			
			Node currentNode = head;
			while(currentNode!=null) {
				System.out.println(currentNode.data);
				currentNode=currentNode.next;
			}
			
			
		}
	}
	
	
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
//	//delete last
//	public void removeLast() {
//		if(head==null) {
//			System.out.print("List is empty");
//			return;
//		}
//		 
//		if(head.next==null) {
//			head=null;
//		}
//		Node currentNode = head;
//		while(currentNode.next.next!=null) {
//			currentNode=currentNode.next;
//		}
//		currentNode.next=null;
//		
//	}
	
//	public static void addFirst(int data) {
//	Node newNode= new Node(data);
//	if(head==null) {
//		head= newNode;
//		return;
//	}
//	newNode.next=head;
//	head=newNode;
//}

}
