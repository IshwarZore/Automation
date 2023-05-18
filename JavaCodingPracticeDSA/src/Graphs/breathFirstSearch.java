package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class breathFirstSearch {
	
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
		
		}
		
		public void BSF(int s) {
			boolean [] visit = new boolean [adj.length];
//			int [] parent = new int[adj.length];
			
			Queue<Integer> q= new LinkedList<Integer>();
			
			//Initialize
			q.add(s);
			visit[s]=true;
//			parent[s]=-1;
			
			while(!q.isEmpty()) {
				int p= q.poll();
				System.out.print(p+"->");
				for(int i: adj[p]) {
					if(visit[i]==false) {
						q.add(i);
						visit[i]=true;
//						parent[i]=p;
					}
				}
			}
			
			System.out.print("Null");
			
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
		System.out.println("Enter source for traversal");
		int s= sc.nextInt();
		
		g.BSF(s);
		
	}
	
}
