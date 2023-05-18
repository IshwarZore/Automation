package Recurssion;

import java.util.*;

public class noOfX {
	
	public static String xLast(String str, String str1,int x,int count) {
		if(x==str.length()) {
			for(int i=0;i<count;i++) {
				str1 = str1+'x';
			}
			return str1;
		}
		
		if(str.charAt(x)!='x') {
			str1 = str1+str.charAt(x);
		}else {
			count++;
		}
		return xLast(str,str1,x+1,count);
	}
	
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		String str1="";
		System.out.print(xLast(str,str1,0,0));
		
	}

}
