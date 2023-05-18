package segmentTree;

import java.util.Scanner;

public class understandingSegmentTree {

	static int N = (10^5)+2;
	static int[] tree= new int [4*N];
	static int[] a= new int [N];
	
	static void build (int node, int s, int e) {
		if(s==e) {
			tree[node]=a[s];
			return;
		}
		int mid = (s+e)/2;
		build(2*node+1,s,mid);
		build(2*node+2,mid+1,e);
		
		// Because we are building a tree for sum
		// this statement will change according to the problem
		tree[node]=tree[2*node+1]+tree[2*node+2];
		return;
		
	}
	
	public static void main(String args[]) {
	    Scanner sc= new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	    build(0,0,n-1);
	    for(int i=0;i<15;i++) {
	    	System.out.print(tree[i]+" ");
	    }
	}
	
}
