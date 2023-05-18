package Recurssion;

import java.util.*;

public class printKeypadCombo {
	public static String[] keypad = {".","ab","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void printComb(String str,int x,String combo) {
		
		if(x==str.length()) {
			System.out.println(combo);
			return;
		}
		
		
		char c = str.charAt(x);
		String mapping = keypad[c-'0'];
		
		for(int i=0;i<mapping.length();i++) {
			printComb(str,x+1,combo+mapping.charAt(i));
		}
		
	}
	
	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		printComb(str,0,"");
	}
	

}

// time complexity is 3^n or 2^n or 4^n 0r 1^n depending on no of char in the selected mapping element
