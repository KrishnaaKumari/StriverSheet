package BinaryTree18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class checkIdenticalTree {
	
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
	
	public static boolean checkIdentical(TreeNode root1,TreeNode root2)
	{
		if(root1==null&&root2==null)
			return true;
		
		if(root1==null||root2==null)
			return false;
		else if(root1.data!=root2.data)
			return false;
		return checkIdentical(root1.left,root2.left)
		&&checkIdentical(root1.right,root2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1=buildLevelOrderTree();
		printLevelOrder(root1);
		TreeNode root2=buildLevelOrderTree();
		printLevelOrder(root2);

		System.out.println(checkIdentical(root1,root2));
	}

}
