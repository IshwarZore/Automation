package binarySearchTree;

import java.util.ArrayList;

public class BST {
	
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

	public static void main(String args[]) {
		int [] nodes= {8,5,10,3,6,11,14};
		Node root=null;
		int x = (int) Math.pow(2, 2);

		int a = Integer.MIN_VALUE;
		for(int i=0;i<nodes.length;i++ ){
			root= insert(root,nodes[i]);
		}
		
		inOrder(root);
		System.out.println();
//		printRange(root,2,12);
		ArrayList <Integer> arr= new ArrayList<>();
		rootToLeaf(root,arr);

		
	}
	
	public static Node insert(Node root, int val) {
		if(root==null) {
			root= new Node(val);
			return root;
		}
		
		if(root.data>val) {
			root.left= insert(root.left,val);
		}else root.right= insert(root.right,val);
		
		return root;
		
	}
	
		
	private static void rootToLeaf(Node root, ArrayList<Integer> arr) {
		
		if(root==null) {
			return;
		}
		
		arr.add(root.data);
		
		if(root.left==null&&root.right==null) {
			for(int i=0;i<arr.size();i++) {
				System.out.print(arr.get(i)+"->");
			}
			System.out.println("Null");
			//arr.remove(arr.size()-1);
			
		}else {
			
			rootToLeaf(root.left,arr);
			rootToLeaf(root.right,arr);
		}
		arr.remove(arr.size()-1);
		return;
 
	}


	
	private static void printRange(Node root, int i, int j) {
		if(root==null) {
			return ;
		}

//		//My method
//		printRange(root.left,i,j);
//		if(root.data>=i && root.data<=j) {
//		System.out.print(root.data+"  ");
//		}
//		printRange(root.right,i,j);
		
		//Apna College method
		if(root.data>=i && root.data<=j) {
			printRange(root.left,i,j);
			System.out.print(root.data+"  ");
			printRange(root.right,i,j);
		}
		else if(root.data<=i) {
			printRange(root.right,i,j);
		}
		else {
			printRange(root.left,i,j);
		}
		
	}
	// VERYYYYYYYYYYYYYYYYY IMPORTANTTTTTTTTTTTTTTTTTTT
	private static Node delete(Node root, int val) {
		
		if(root==null) {
			System.out.println();
			System.out.println("Value not found");
			return null;
		}
		
		if(root.data>val) {
			root.left=delete(root.left,val);
			
		}else if(root.data<val) {
				root.right= delete(root.right,val);
				
		}else {
			//Case 1
			if(root.left==null && root.right==null) {
				System.out.println();
				System.out.println("Value deleted");
				return null;
			}
			// Case 2
			else if(root.left==null ) {
				System.out.println();
				System.out.println("Value deleted");
				return root.right;
			}
			else if(root.right==null) {
				System.out.println();
				System.out.println("Value deleted");
				return root.left;
			}
			
			//Case 3
			if(root.left!=null && root.right!=null) {

				Node IS=inOrderSuccessor(root.right);
				root.data=IS.data;
				root.right=delete(root.right,IS.data);
			}
			
		}
		return root;
		
	
		
	}


	private static Node inOrderSuccessor(Node left) {
		while(left.left!=null) {
			left=left.left;
		}
		return left;
	}

	public static void search(Node root, int val) {
		
	}
	
	public static void inOrder(Node root) {
		if(root==null) {
			return ;
		}
		
		inOrder(root.left);
		System.out.print(root.data+"  ");
		inOrder(root.right);
	}
	
	
	
	

}
