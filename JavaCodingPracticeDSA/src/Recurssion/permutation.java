package Recurssion;

import java.util.*;

public class permutation {
	
	public static void permute(String str, String permutation) {
		
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			String newStr = str.substring(0, i)+ str.substring(i+1);
			permute(newStr,permutation+c);
		}
	}

	public static void main (String arg[]) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		permute(str,"");
		
	}
	
}
