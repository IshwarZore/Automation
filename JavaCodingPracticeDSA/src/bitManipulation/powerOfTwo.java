package bitManipulation;

import java.util.*;

public class powerOfTwo {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int num= s.nextInt();
	int bitMal = (num & (num-1));
	if (bitMal==0) {
		System.out.print("The number is a power of 2");
	}else {
		System.out.print("The number is not a power of 2");
	}
}
	
}
