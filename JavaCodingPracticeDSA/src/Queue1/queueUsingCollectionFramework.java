package Queue1;
import java.util.*;

public class queueUsingCollectionFramework {
	
	public static void main(String args[]) {
		
		
		// DQ is a double ended Queue
		//null elements are allowed in the LinkedList implementation but not in the ArrayDeque implementation.
		//In terms of efficiency, ArrayDeque is more efficient than the LinkedList for add and remove operation at both ends. 
		//The best operation in a LinkedList implementation is removing the current element during the iteration. 
		//LinkedList implementations are not ideal structures to iterate.
		//The LinkedList implementation consumes more memory than the ArrayDeque implementation.
		//Linked structures are possibly the worst structure to iterate with a cache miss on each element.
		//Linked list is better than ArrayDQ when the list is very large .... 
		//as new memory has to be alloted to Array DQ (just like ArrayList) every time it exceeds its limit
		//In particular, arrays are contiguous memory blocks, 
		//so large chunks of them will be loaded into the cache upon first access. 
		//This makes it comparatively quick to access future elements of the array. 
		//Linked lists on the other hand aren't necessarily in contiguous blocks of memory, 
		//and could lead to more cache misses, which increases the time it takes to access them.
		
		//Queue<Integer> q= new LinkedList<>(); 
		// keep everything same for Deque and LL
		Queue<Integer> q= new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
	}

}
