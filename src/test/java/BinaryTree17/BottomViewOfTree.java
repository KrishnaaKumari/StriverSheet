package BinaryTree17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Pairs{
	TreeNode root;
	int hd;
	Pairs (TreeNode root, int hd)
	{
		this.root=root;
		this.hd=hd;
	}
	
}
public class BottomViewOfTree {

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
	
	public static ArrayList<Integer> printBottomViewTree(TreeNode root)
	{
		if(root==null)
			return null;
		HashMap<Integer,TreeNode> hm= new HashMap<Integer,TreeNode>();
		Queue<Pairs>pending=new LinkedList<>();
		Pairs p1= new Pairs(root,0);
		pending.add(p1);
		while(!pending.isEmpty())
		{
			Pairs p = pending.poll();
			
//			if(!hm.containsKey(p.hd))
//			{
				hm.put(p.hd,p.root);
//			}
			if(p.root.left!=null)
				pending.add(new Pairs(p.root.left,p.hd-1));
			if(p.root.right!=null)
				pending.add(new Pairs(p.root.right,p.hd+1));
		}
		ArrayList<Integer> index= new ArrayList<>();
		for(Integer k : hm.keySet())
			index.add(k);
		Collections.sort(index);
		ArrayList<Integer> res= new ArrayList<>();
		for(Integer k:index)
			res.add(hm.get(k).data);
		
		return res ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= buildLevelOrderTree();
		printLevelOrder(root);
		ArrayList<Integer> ans = printBottomViewTree(root);
		for(Integer i : ans)
			System.out.print(i+" ");
		System.out.println();
	}


}
