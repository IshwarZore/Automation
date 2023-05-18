package Queue1;

import Queue1.understandQueue.Queue;

public class circularQueue {

	static class Queue{
		
		static int arr[];
		static int size;
		static int rear=-1;
		static int front=-1;
		
		Queue(int n){
			this.size=n;
			arr = new int[n];
		}
		
		public static boolean isEmpty() {
			return rear ==-1;
		}
		
		public static void add(int n) {
			if(rear+1==front||(rear==size-1&&front==0)) { //  or (rear+1)%size==front
				System.out.println("Queue is FULL ! ");
				return;
			}
			if(isEmpty()) {
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=n;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is EMPTY ! ");
				return -1;
			}
			
			int top = arr[front];
			
			if(front==rear) {
				arr[front]=0;
				front=-1;
				rear=-1;
				return top;
			}
			arr[front]=0;
			front=(front+1)%size;
			
			
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is EMPTY ! ");
				return -1;
			}
			return arr[front];
		}
		public static void printArray() {
		for(int i=0; i<size;i++) {
			System.out.println(arr[i]);
		}
	}
		
	}
	
	public static void main(String args[]) {
		Queue q= new Queue(6);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		
		q.printArray();
		
		System.out.println("Remove : "+q.remove());
		System.out.println("Remove : "+q.remove());
		System.out.println("Remove : "+q.remove());
		
		q.printArray();
		
		q.add(1);
		q.add(2);
		
		q.printArray();
		
		System.out.println(q.isEmpty());
		
		System.out.println("Remove : "+q.remove());
		System.out.println("Remove : "+q.remove());
		System.out.println("Remove : "+q.remove());
		System.out.println("Remove : "+q.remove());
		System.out.println("Remove : "+q.remove());
		
		System.out.println(q.isEmpty());
		
//		while(!q.isEmpty()) {
//			System.out.println(q.remove());
//		}

		
	}

}
