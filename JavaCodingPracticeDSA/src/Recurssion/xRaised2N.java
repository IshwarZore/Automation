package Recurssion;

import java.util.*;

public class xRaised2N {
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
	
	return x*xRaised(n-1,x);
}
}
