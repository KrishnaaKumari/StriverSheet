package BinaryTree18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeastCommonAncestor {
	
	public static TreeNode buildLevelOrderTree()
	{
		Scanner sc = new Scanner(System.in);
		Queue<TreeNode>pending=new LinkedList<TreeNode>();
		System.out.println("Enter root: ");
		TreeNode root= new TreeNode(sc.nextInt());
		pending.add(root);
		while(!pending.isEmpty())
		{
			TreeNode curr=pending.poll();
			System.out.println("Enter left node: ");
			int leftside=sc.nextInt();
			if(leftside!=-1)
			{
				TreeNode leftchild= new TreeNode(leftside);
				curr.left=leftchild;
				pending.add(leftchild);
			}
			System.out.println("Enter right node: ");
			int rightside=sc.nextInt();
			if(rightside!=-1)
			{
				TreeNode rightchild= new TreeNode(rightside);
				curr.right=rightchild;
				pending.add(rightchild);
			}
		}
		return root ;
	}
	
	public static void printLevelOrder(TreeNode root)
	{
		Queue<TreeNode>pending=new LinkedList<TreeNode>();
		System.out.println("Tree printing: ");
		pending.add(root);
		while(!pending.isEmpty())
		{
			TreeNode curr=pending.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null)
				pending.add(curr.left);
			if(curr.right!=null)
				pending.add(curr.right);
			
		}
		System.out.println();
	}
	
	public static TreeNode leastCommonAncestor(TreeNode root,TreeNode p, TreeNode q)
	{
		 if(root==null)
	         return null ;
	        TreeNode left=leastCommonAncestor(root.left,p,q);
	        TreeNode right=leastCommonAncestor(root.right,p,q);

	         if(root==p||root==q)
	         return root;
	         
	         if(left==null)
	         return right ;

	         if(right==null)
	         return left ;

	         return root ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=buildLevelOrderTree();
		printLevelOrder(root);
		TreeNode p = new TreeNode(30);
		TreeNode q = new TreeNode(40);
		TreeNode ans = leastCommonAncestor(root,p,q);
		System.out.println(ans.data);

	}

}
