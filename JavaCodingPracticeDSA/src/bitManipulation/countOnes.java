package bitManipulation;

import java.util.Scanner;

public class countOnes {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		int[] arr= {1,0,0,3};
		
		int count=0;
		
		for(int bit=1 ; bit<=num ; bit = bit<<1 ) {
			if((bit&num)!=0) {
				count=count+1;
			}
		}
		System.out.print("The number of 1’s in a binary representation of the number are : "+count);
		
	}
}	

