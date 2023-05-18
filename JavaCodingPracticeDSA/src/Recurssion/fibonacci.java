package Recurssion;

import java.util.Scanner;

public class fibonacci {
	public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
		
		System.out.print(printFibonacci(i));
		}
		//printFibonacci(n);
		}

		private static int printFibonacci(int n) {
			
			if(n==0) {
				//System.out.print(n);
				return n;
			}
			
			if(n==2 || n==1) {
				//System.out.print(n);
				return 1;
			}else {
				//System.out.print(n);
			
			return printFibonacci(n-1)+printFibonacci(n-2);
			}
			
		}
}
