package Recurssion;

import java.util.*;

public class subsequences {
	
	//Normal
	public static void sub(String str,int x,String subStr) {
		
		if (x==str.length()) {
			System.out.println(subStr);
			return;
		}
		
		char c=str.charAt(x);
		//to be
		sub(str,x+1,subStr+c);
		//not to be
		sub(str,x+1,subStr);
	}
	
	//Unique
	public static void subUni(String str,int x,String subStr,HashSet<String> set) {
		
		if (x==str.length()) {
			if (set.contains(subStr)) {
				return;
				
			}else {
				
				System.out.println(subStr);
				set.add(subStr);
				return;
			}
		}
		
		char c=str.charAt(x);
		//to be
		subUni(str,x+1,subStr+c,set);
		//not to be
		subUni(str,x+1,subStr,set);
	}
	
	public static void main(String arg[]) {
		
		
	Scanner sc= new Scanner(System.in);
	String str = sc.next();
	HashSet<String> set= new HashSet<>();
	//sub(str,0,"");
	subUni(str,0,"",set);
	}

}

//time complexity is (2^n)-1 i.e 2^n
