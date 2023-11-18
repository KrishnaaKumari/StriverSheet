package LinkedList5;

public class RemoveNthNode {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null)
			return null ;
		int len=0 ;
		ListNode temp=head ;
		while(temp!=null)
		{
			len++ ;
			temp=temp.next ;
		}
		
		if(n>len)
			return head ;
		//len=5, n=5, delete first element
		if(n==len)
			return head.next ;
		n=len-n ;
		temp=head;
		for(int i=0 ; i<n-1 ; i++)
			temp=temp.next ;
		
		if(temp.next!=null)
		temp.next=temp.next.next ;
		return head ;
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
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head= new ListNode(1);
		ListNode first= new ListNode(2);
		head.next=first ;
		ListNode second= new ListNode(3);
		first.next=second ;
		ListNode third= new ListNode(4);
		second.next=third ;
		ListNode forth= new ListNode(5);
		third.next=forth ;
		ListNode fifth=new ListNode(6);
		forth.next=fifth ;
		printListNode(head);
		ListNode h=removeNthFromEnd(head,8);
		
		printListNode(h);
	}

}
