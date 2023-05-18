package Recurssion;

import java.util.Scanner;

public class FirstAndLastOccurance {
	
	public static int first=-1;
	public static int last =-1;
	
public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		
		occur(0,str,'a');
		
		
}

public static void occur(int x, String str, char c) {
	if(x==str.length()) {
		System.out.println(first);
		System.out.println(last);
		return ;
	}
	
	if(str.charAt(x) == c) {
		if(first==-1) {
			first=x;
			last=x;
		}else {
			last=x;
		}
		
	}
	
	occur(x+1,str,c);
}
}
