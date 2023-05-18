package functionalPrograming;
import java.util.*;
import java.util.stream.Collectors;

public class lambdaExpressions {
	
	
	    public static void main(String[] args){
	        List<Integer> numList=Arrays.asList(10,20,30,40,50);
	        
	        System.out.println("===forEach===");
	        numList.stream().forEach(num->System.out.println(num));
	        
	        System.out.println("===forEach alternative===");
	        numList.stream().forEach(System.out::println);
	        
	        System.out.println("==map===");
	        List<Integer> newList=numList.stream().map(n->n*2).collect(Collectors.toList());
	        System.out.println(newList);
	        
	        System.out.println("==filter===");
	        List<Integer>filteredList=numList.stream().filter(n->n>30).collect(Collectors.toList());
	        System.out.println(filteredList); 
	        
	        System.out.println("==Chaining===");
	        List<Integer>chainedList=numList.stream().map(n->n*2).filter(n->n>30).collect(Collectors.toList());
	        System.out.println(chainedList);
	    
	}


}
