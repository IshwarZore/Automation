package Recurssion;

import java.util.*;

public class pathsOfMaze {
	//recursion : huge time complexity
	public static int count(int i, int j,int n, int m ) {
		if((i == n) || (j == m)) {
			return 0;
		}
		
		if(i == n-1 && j == m-1) {
			return 1;
		}
		
		int downside = count(i+1,j,n,m);
		int rightside = count(i,j+1,n,m);
		
		return downside + rightside ;
	}
	// DP 
	public static int count1(int n, int m) {
		
		// matrix to represent total number of ways to reach every index from 0,0
		int[][] maze = new int [n][m];
		
		//initialize 1 on all first col
		for(int i=0; i<n; i++) {
			maze[i][0]=1;
		}
		
		//intitialize 1 on all 1st row
		for(int i=0; i<m; i++) {
			maze[0][i]=1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				maze[i][j]= maze[i-1][j]+maze[i][j-1];
			}
		}
		
		return maze[n-1][m-1];
			
	}
	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println("With Recursion and Backtracking:-"+count(0,0,n,m));
		System.out.print("Without Recursion & With DP :-"+count1(n,m));
		
	}

}
