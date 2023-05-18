package Hashing1;
import java.util.*;

public class hashSetIntro {
	
	public static void main (String args[]){
		
		HashSet<Integer> set = new HashSet<>();
		
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		
	    //Search
		if(set.contains(1)) {
			System.out.println("Yes");
		}
		
		// Delete
		set.remove(1);
		
		//Size
		System.out.println(set.size());
		
		//print 
		System.out.println(set);
		
		//Iterator
		// the sequence of hash set is unknown/random because HashSet is unordered
		
		Iterator<Integer> i= set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());	
		}
		
		
	}
}
