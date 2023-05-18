package BinaryTree1;

public class sumOfData {
	
	
//	static int sum=0;

	public static void main (String args[]) {
		
		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b= new BinaryTree();
		Node root= b.Build(nodes);
		System.out.println(b.sumNode(root));
		
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
	static int sumNode(Node root) {
		if(root==null) {
			return 0;
		}
//		sum=sum+root.data;
//		sumNode(root.left);
//		sumNode(root.right);
//		
//		return 	sum ;
		
		return sumNode(root.left)+sumNode(root.right)+root.data;
		
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
