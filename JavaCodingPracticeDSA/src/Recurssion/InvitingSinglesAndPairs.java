package Recurssion;

import java.util.Scanner;

public class InvitingSinglesAndPairs {
	
	
	public static int  invite(int n) {
		//option 1:- I think this one is more correct
		/*if(n<=2) {
			return n;
		}*/
		
		//option 2
		if (n<=1) {
			return 1;
		}
		
		int single = invite(n-1);
		int pairs = (n-1)*invite(n-2);
		
		return single + pairs ;
		
		
	}
	
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println(invite(n));
	}

}
