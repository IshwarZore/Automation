package Recurssion;

import java.util.*;

public class Recursion1 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m=1;
		printNumb(n,m);
	}

	private static void printNumb(int n,int m) {
		// TODO Auto-generated method stub
		if (n==0) {
			return;
		}
		System.out.print(m);
		m++;
		n--;
		printNumb(n,m);
	}
	
}
