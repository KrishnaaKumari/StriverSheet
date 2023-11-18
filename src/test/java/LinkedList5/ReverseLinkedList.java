package LinkedList5;

public class ReverseLinkedList {
	
	public static ListNode reverseList(ListNode head)
	{
		if(head==null)
			return null ;
		ListNode curr=head;
		ListNode prev=null ;
		while(curr!=null)
		{
			ListNode next=curr.next ;
			curr.next=prev;
			prev=curr ;
			curr=next ;
		}
		return prev ;
	}
	
	public static void printListNode(ListNode head)
	{
		if(head==null)
			return ;
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next ;
		}
	}
	
	public static ListNode addend(ListNode head,int data)
	{
		if(head==null)
		{
			head.data=data ;
			return head ;
		}
		ListNode temp=head;
		while(temp.next!=null)
			temp=temp.next ;
		temp.next=new ListNode(data);
		return head ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(10);
		head=addend(head, 20);
		head=addend(head, 30);
		head=addend(head, 40);
		head=addend(head, 50);
		head=reverseList(head);
		printListNode(head);
		
	}

}
