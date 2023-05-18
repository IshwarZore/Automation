package functionalPrograming;

import java.util.*;

public class lonelyInteger {
	
	public static void main(String[] args){
	    List<Integer> numList=Arrays.asList(1,1,5,4,3,3,5,6,7,2,7,6,2);
	    Integer unique = numList.stream().reduce((x,y)->x^y).orElse(0);
	    System.out.println(unique);
	}


}


//XORing n numbers is like counting the number of 1 bits in each position, 
//and setting the corresponding output bit to 1 if the count is odd. 
//The order in which you are XORing them doesn't matter.
//
//If an array contains x pairs of equal numbers and one unique number, 
//the bits of the equal pairs cancel each other (since they contribute an even number of 1s in each position), 
//leaving you with just the bits of the unique number.
//
//For example, take the following list of numbers :
//
//100100101
//010110110
//101101100 // the unique number
//100100101
//010110110