package BinaryTree1;

public class subtreeOfAnotherTree {
	
public static void main (String args[]) {
		
		int[] nodes1 = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b1= new BinaryTree();
		Node root1= b1.Build(nodes1);
		
		int[] nodes2 = {3,-1,6,-1,-1};
		BinaryTree b2= new BinaryTree();
		Node root2= b2.Build(nodes2);
		
		System.out.print(b1.subTree(root1,root2));
		//// solved in leet code
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
	
	public static boolean subTree(Node tree, Node sub) {
		
		if(tree==null && sub==null) {
			return true;
		}
		
		if(tree.data==sub.data) {
			return subTree(tree.left,sub.left)&&subTree(tree.right,sub.right);
		}else return subTree(tree.left,sub)|| subTree(tree.right,sub);
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
