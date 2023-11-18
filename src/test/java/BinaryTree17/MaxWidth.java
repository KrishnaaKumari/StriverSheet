package BinaryTree17;

import java.util.* ;
public class MaxWidth {
	
	public static int countMaxWidth(TreeNode root)
	{
		if(root==null)
			return 0;
		int maxwidth=0;
		
		return maxwidth ;
	}
	
	public static TreeNode buildLevelOrderTree()
	{
		Scanner sc = new Scanner(System.in);
		Queue<TreeNode>pending=new LinkedList<>();
		System.out.println("Enter root: ");
		TreeNode root= new TreeNode(sc.nextInt());
		pending.add(root);
		while(!pending.isEmpty())
		{
			TreeNode curr=pending.poll();
			System.out.println("Enter left child: ");
			int leftchild=sc.nextInt();			
			if(leftchild!=-1)
			{
				TreeNode leftside= new TreeNode(leftchild);
				curr.left=leftside;
				pending.add(curr.left);
			}
			System.out.println("Enter right child: ");
			int rightchild=sc.nextInt();
			if(rightchild!=-1)
			{
				TreeNode rightside= new TreeNode(rightchild);
				curr.right=rightside;
				pending.add(curr.right);
			}
		}
		return root ;
		
	}
	
	public static void printLevelOrder(TreeNode root)
	{
		if(root==null)
			return ;
		Queue<TreeNode>pending=new LinkedList<>();
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: root = [1,3,2,5,null,null,9,6,null,7]
//				Output: 7
//				Explanation: The maximum width exists in the fourth level
//		with length 7 (6,null,null,null,null,null,7).
		
		TreeNode root=buildLevelOrderTree();
		printLevelOrder(root);
		int max=countMaxWidth(root);
		System.out.println();
		System.out.println(max);
	}

}
