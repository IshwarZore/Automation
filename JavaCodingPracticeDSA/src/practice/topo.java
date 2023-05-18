package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class topo {
	
	static class Graph{
		private int V;
		private LinkedList<Integer> adj[];
		
		Graph(int v){
			V=v;
			adj= new LinkedList[v];
			 for (int i=0; i<v; ++i)
		            adj[i] = new LinkedList();
		}
		
		public void addEdge(int s, int e) {
			adj[s].add(e);
		}
		
		public void topo() {
			Stack <Integer> stack = new Stack<>();
			boolean visited[]= new boolean[V];
			Arrays.fill(visited, false);
			
			for(int i=0; i<V;i++) {
				if(visited[i]==false) {
					topoSort(i,visited,stack);
				}
			}
			
			while(stack.isEmpty()==false) {
				System.out.print(stack.pop() + "->");
			}
			System.out.print("Null");
		}

		private void topoSort(int v, boolean[] visited, Stack<Integer> stack) {
			visited[v]=true;
			int i;
			Iterator <Integer> it= adj[v].iterator();
			while(it.hasNext()) {
				i=it.next();
				if(visited[i]==false)
				topoSort(i,visited,stack);
			}
			
			stack.push(v);
			
		}
		
	}
	
	public static void main(String args[]) {
		Graph g= new Graph(6);
		
		 g.addEdge(5, 2);
		 g.addEdge(5, 0);
		 g.addEdge(4, 0);
		 g.addEdge(4, 1);
		 g.addEdge(2, 3);
		 g.addEdge(3, 1);
		 
		 g.topo();
	}

}
