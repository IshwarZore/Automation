
package BinaryTree1;

import BinaryTree1.heightOfTree.BinaryTree;
import BinaryTree1.heightOfTree.Node;

public class longestDiameter {
	public static void main (String args[]) {
		
		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b= new BinaryTree();
		Node root= b.Build(nodes);
		System.out.println(b.longestDia2(root).d);
		
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
		
		static int heightNode(Node root) {
			if(root==null) {
				return 0;
			}
			
			int left=heightNode(root.left);
			int right=heightNode(root.right);
			

			return Math.max(left, right)+1;	
			
		}
		
		
		// Approch 1: time complexity is n square coz we are caling both the functions of height and dia
		static int longestDia1(Node root) {
		if(root==null) {
			return 0;
		}
		
		int left=heightNode(root.left);
		int right=heightNode(root.right);
		int rootDia= left+right+1;
		int childDia= Math.max(longestDia1(root.left),longestDia1(root.right));

		return Math.max(rootDia,childDia);
	}
		
		//Approcgh 2 : time complexity n 
		// step 1 define a class TreeInfo
		
		static TreeInfo longestDia2(Node root) {
			
			if(root==null) {
				
				return new TreeInfo(0,0) ;
			}
	
			TreeInfo left= longestDia2(root.left);
			TreeInfo right= longestDia2(root.right);
			
			
			int myHeight= Math.max(left.h, right.h)+1;
			
			int d1= left.d;
			int d2= right.d;
			int d3= left.h+right.h+1;
			
			
			int myDia=Math.max(Math.max(d1, d2), d3);
			
			return new TreeInfo(myHeight,myDia);
			
		}
	}
	
		static class TreeInfo{
			int h;
			int d;
			TreeInfo(int h, int d){
				this.h=h;
				this.d=d;
			}
		}
		
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

}
