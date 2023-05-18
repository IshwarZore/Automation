package BinaryTree1;

import java.util.*;

public class understandingBinaryTree {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinaryTree{
		
		static int x=-1;
		public static Node Build(int nodes[]) {
			x++;
			if(nodes[x]==-1) {
				return null;
			}
			
			Node newNode= new Node(nodes[x]);
			newNode.left= Build(nodes);
			newNode.right=Build(nodes);
			
			return newNode;
			
		}
		
		//pre order Traversal : root then left and then right
		 //type of depth first traversal(DFS)
		
		public static void tr1(Node root) {
			if(root==null) {
			//	System.out.print(-1+"  ");
				return ;
			}
			System.out.print(root.data+"  ");
			tr1(root.left);
			tr1(root.right);
		}
		
		 // in order Traversal : left the root and then right
		 //type of depth first traversal(DFS)
		
		
		public static void tr2(Node root) {
			if(root==null) {
				return ;
			}
			
			tr2(root.left);
			System.out.print(root.data+"  ");
			tr2(root.right);
		}
		

		 // in order Traversal : without recursion

		
		
		public static void tr5(Node root) {
			if(root==null) {
				return ;
			}
			
			ArrayList<Node> ans = new ArrayList<Node>();
			Stack <Node> stack= new Stack<Node>();
			Node curr= root;
			
			while(!stack.empty() || curr!=null) {
				while(curr!=null) {
					stack.push(curr);
					curr= curr.left;
				}
				curr= stack.peek();
				ans.add(stack.pop());
				curr= curr.right;
			}
			
			for(Node n: ans) {
				System.out.print(n.data+"->");
			}
			
			
		}
		
		//post order Traversal : left then right and then root 
		//type of depth first traversal(DFS)
		
		
		public static void tr3(Node root) {
			if(root==null) {
			//	System.out.print(-1+"  ");
				return ;
			}
			
			tr3(root.left);
			tr3(root.right);
			System.out.print(root.data+"  ");
		}
		
		//level wise Traversal/ breath first traversal(BFS) : root then left and then right
		public static void tr4(Node root) {
			if(root==null) {
				return;
			}
			Queue <Node> q= new LinkedList<>();
			
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currNode = q.remove();
				if(currNode==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}else q.add(null);   //very important step 					
				}else {
					System.out.print(currNode.data+" ");
					
					if(currNode.left!=null) {
					q.add(currNode.left);
					}
					if(currNode.right!=null) {
					q.add(currNode.right);
					}
				}
				
			}
			
			
			
		}
	}
	
	public static void main(String args[]) {
		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b= new BinaryTree();
		Node root= b.Build(nodes);
		
		b.tr1(root);
		System.out.println("");
		
		b.tr2(root);
		System.out.println("");
		
		b.tr3(root);
		System.out.println("");
		
		b.tr4(root);
		System.out.println("");
		
		b.tr5(root);
		
	}

}
