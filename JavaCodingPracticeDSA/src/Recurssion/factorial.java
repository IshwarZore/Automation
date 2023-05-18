package Recurssion;

import java.util.*;

public class factorial {

	public static void main(String arg[]) {
		
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	System.out.print(printFactorial(n));
	
	}

	private static int printFactorial(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		
		return n*printFactorial(n-1);
		
	}
}
