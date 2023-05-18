package Recurssion;

import java.util.Scanner;

public class towerOfHanoi {
	
	public static void hanoi(int n, String src, String helper, String des) {
		if(n==1) {
			System.out.println("Transfer disk "+n+" from "+src+" to "+des);
			return;
		}
		hanoi(n-1,src,des,helper);
		System.out.println("Transfer disk "+n+" from "+src+" to "+des);
		hanoi(n-1,helper,src,des);
		
	}
	
public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		hanoi(n,"S","H","D");
		
}

}

// Time Complexity is approx 2^n
