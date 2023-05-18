package Recurssion;

import java.util.Scanner;

public class ReverseString {
	
	
public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int n= str.length()-1;
		reverse(n,str);
		
}

public static void reverse(int n, String str) {
	if(n==0) {
		System.out.print(str.charAt(n));
		return;
	}
	System.out.print(str.charAt(n));
	reverse(n-1,str);
	
}
}
//Time Complexity is approx n
