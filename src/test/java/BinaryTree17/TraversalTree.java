package BinaryTree17;

public class TraversalTree {
	
	public static void preOrder(TreeNode root)
	{
		if(root==null)
			return ;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(TreeNode root)
	{
		if(root==null)
			return ;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void postOrder(TreeNode root)
	{
		if(root==null)
			return ;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode one = new TreeNode(10);
		TreeNode two = new TreeNode(20);
		one.left=two ;
		TreeNode three = new TreeNode(30);
		one.right=three ;
		TreeNode four = new TreeNode(40);
		two.left=four ;
		
		System.out.println("PreOrder Relation: ");
		preOrder(one);
		System.out.println();
		
		System.out.println("InOrder Relation: ");
		inOrder(one);
		System.out.println();
		
		System.out.println("PostOrder Relation: ");
		postOrder(one);
		System.out.println();
		

	}

}
