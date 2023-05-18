package Queue1;

public class understandQueue {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear=-1;
		
		Queue(int n){
			this.size=n;
			arr = new int[n];
		}
		
		public static boolean isEmpty() {
			return rear ==-1;
		}
		
		public static void add(int n) {
			if(rear==size-1) {
				System.out.println("Queue is FULL ! ");
				return;
			}
			rear++;
			arr[rear]=n;
		}
		
		public static int remove() {
			
			if(isEmpty()) {
				System.out.println("Queue is EMPTY ! ");
				return -1;
			}
			
			int top = arr[0];
			for(int i=0; i<=rear; i++) {
				if(i==rear) {
					arr[i]=0;
				}else arr[i]=arr[i+1];
			}
			rear--;
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is EMPTY ! ");
				return -1;
			}
			return arr[0];
		}
//		public static void printArray() {
//			for(int i=0; i<size;i++) {
//				System.out.println(arr[i]);
//			}
//		}
//		
	}
	
	public static void main(String args[]) {
		Queue q= new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
//		q.printArray();
		
	}

}
