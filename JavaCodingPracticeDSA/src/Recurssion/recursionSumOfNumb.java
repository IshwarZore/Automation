package Recurssion;

import java.util.Scanner;

public class recursionSumOfNumb {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int j=1;
		System.out.print(sumOfNum(n,sum,j));
	}

	private static int sumOfNum(int n,int sum,int j) {
		
		
		if (n==0) {
			return sum;
		}
		
		sum=sum+j;
		n--;
		j++;
		return sumOfNum(n,sum,j);
	}
	
}
