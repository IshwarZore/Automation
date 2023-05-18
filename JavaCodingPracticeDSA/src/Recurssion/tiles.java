package Recurssion;

import java.util.*;

public class tiles {
	
	
	public static int tile(int n, int m){
		
		if(n<m) {
			return 1;
		}
	
		if(n==m) {
		return 2;
		}
		
		int vertical = tile(n-m,m);
		int horizontal = tile(n-1,m);
		
		return vertical + horizontal;
		
	}
	
	
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(tile(n,m));
	}

}
