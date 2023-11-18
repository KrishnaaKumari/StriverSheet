package BinaryTree17;

import java.util.*;
public class RootToNode {
	
	public static ArrayList<String> pathRootToNode(TreeNode root)
	{
		String xtr="";
		ArrayList<String>ansStr=new ArrayList<String>();
		pathFromRootToNode(root,xtr,ansStr);
		return ansStr ;
	}

	public static void pathFromRootToNode(TreeNode root, String xtr, ArrayList<String> ansStr)
	{
		if(root==null)
		{
			return ;
		}
		xtr=xtr+" "+root.data;
		if(root.left==null&&root.right==null)
		{
			ansStr.add(xtr);
		}
		pathFromRootToNode(root.left,xtr,ansStr);
		pathFromRootToNode(root.right,xtr,ansStr);
		
	}
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=buildLevelOrderTree();
		printLevelOrder(root);
		System.out.println("Printing: ");
		ArrayList<String>ans=pathRootToNode(root);
		for(String s :ans)
		{
			System.out.print(s);
		}
//		

	}

}
