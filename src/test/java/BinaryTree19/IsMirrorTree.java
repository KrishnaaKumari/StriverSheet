package BinaryTree19;

import java.util.*;

public class IsMirrorTree {
	
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
	
	public static boolean checkMirror(TreeNode root)
	{
		if(root==null)
			return true ;
		return checkMirror(root.left,root.right);
	}
	
	public static boolean checkMirror(TreeNode leftside,TreeNode rightside)
	{
		if(leftside==null||rightside==null)
			return true ;
		if(leftside.data!=rightside.data)
			return false ;
		
		return checkMirror(leftside.left,rightside.right)
				&&checkMirror(leftside.right,rightside.left);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=buildLevelOrderTree();
		printLevelOrder(root);
		System.out.println(checkMirror(root));
	}

}
