package Recurssion;

import java.util.Scanner;

public class xRaised2NLogN {

public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int x= sc.nextInt();
		System.out.print(xRaised(n,x));
}

private static int xRaised(int n,int x) {
	if(n==1) {
		return x;
	}else if(n==0) {
		return 1;
	}
	if (n%2==0) {
	return xRaised(n/2,x)*xRaised(n/2,x);
	}else {
		return xRaised(n/2,x)*xRaised(n/2,x)*x;
	}
	
}
	
}
//Time Complexity is approx log n
