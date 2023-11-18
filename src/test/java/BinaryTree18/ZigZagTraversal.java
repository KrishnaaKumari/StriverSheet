package BinaryTree18;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class ZigZagTraversal {
	
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
	
	public static List<List<Integer>> zigZagTraversal(TreeNode root)
	{
		if(root==null)
			return null ;
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Queue<TreeNode>pending=new LinkedList<>();
		pending.add(root);
		int level=0;
		while(!pending.isEmpty())
		{
			List<Integer> row= new ArrayList<>();
			int size=pending.size();
			for(int i=0 ; i<size ; i++)
			{
				TreeNode curr=pending.poll();
				if(level%2==0)
					row.add(curr.data);
				else
					row.add(0,curr.data);
				if(curr.left!=null)
					pending.add(curr.left);
				if(curr.right!=null)
					pending.add(curr.right);
			}
			level++ ;
			ans.add(row);
		}		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=buildLevelOrderTree();
		printLevelOrder(root);
		List<List<Integer>> res= zigZagTraversal(root);
		for(List<Integer> i : res)
		{
			for (Integer j : i)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
