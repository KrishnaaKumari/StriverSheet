package BinaryTree17;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftViewOfTree {
	
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
	
	public static ArrayList<Integer> printLeftViewTree(TreeNode root)
	{
		Queue<TreeNode>pending=new LinkedList<TreeNode>();
		ArrayList<Integer>ans= new ArrayList<>();
		System.out.println("Tree printing: ");
		pending.add(root);
		while(!pending.isEmpty())
		{
			int size=pending.size();
			for(int i=0 ; i<size ; i++)
			{
				TreeNode curr=pending.poll();
				
				if(i==0)
					ans.add(curr.data);
				if(curr.left!=null)
					pending.add(curr.left);
				if(curr.right!=null)
					pending.add(curr.right);
			}			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TreeNode root= buildLevelOrderTree();
		printLevelOrder(root);
		ArrayList<Integer> ans = printLeftViewTree(root);
		for(Integer i : ans)
			System.out.print(i+" ");
		System.out.println();
	}

}
