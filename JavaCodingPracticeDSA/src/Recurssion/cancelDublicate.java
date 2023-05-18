package Recurssion;

import java.util.Scanner;

public class cancelDublicate {
	
	public static boolean[] arr= new boolean[26];
	
	public static String xLast(String str, String str1,int x,boolean[]arr) {
		if(x==str.length()) {
			return str1;
		}
		
		if(arr[str.charAt(x)-'a']==false) {
			arr[str.charAt(x)-'a']=true;
			str1=str1+str.charAt(x);
		}
		return xLast(str,str1,x+1,arr);
	}
	
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		String str1="";
		
		System.out.print(xLast(str,str1,0,arr));
		
	}

}
