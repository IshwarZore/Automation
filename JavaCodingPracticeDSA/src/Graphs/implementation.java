package Graphs;

import java.util.LinkedList;
import java.util.Scanner;


public class implementation {
	
	static class graph_implementation{
		
		private LinkedList<Integer> adj[];
		
		public graph_implementation(int v) {
			
			adj= new LinkedList[v];
			
			for(int i=0;i<v; i++) {
				adj[i]= new LinkedList<Integer>();
			}
		}	
		
		public void insertEdge(int s, int d) {
			adj[s].add(d);
			adj[d].add(s);
			
			System.out.print(s+"->");
			System.out.println(adj[s]);
		}

		
	}
	
	public static void main(String args[] ) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no vertices & edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		graph_implementation g= new graph_implementation(v);
		System.out.println("Enter edges");
		
		for(int i=0; i<e;i++) {
			int s= sc.nextInt();
			int d= sc.nextInt();
			g.insertEdge(s,d);
		}
		
	}
}


