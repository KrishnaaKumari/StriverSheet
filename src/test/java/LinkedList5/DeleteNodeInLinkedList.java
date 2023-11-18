package LinkedList5;

public class DeleteNodeInLinkedList {
	
	public static void deleteNode(ListNode head,ListNode node)
	{
		node.data=node.next.data ;
		node.next=node.next.next ;
		
	}
	
	
}
