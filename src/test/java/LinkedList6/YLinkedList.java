package LinkedList6;

public class YLinkedList {
	
	public static ListNode getIntersectionNode(ListNode head1, ListNode head2)
	{
		if(head1==null||head2==null)
			return null ;
		
		ListNode temp1=head1;
		ListNode temp2=head2;
		while(temp1!=temp2)
		{
			
			if(temp1==null)
				temp1=head2;
			else
				temp1=temp1.next ;
			if(temp2.next==null)
				temp2=head1;
			else
				temp2=temp2.next ;
		}
		return temp1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1=new ListNode(1);
		ListNode first1=new ListNode(2);
		head1.next=first1 ;
		ListNode second=new ListNode(3);
		first1.next=second;
		ListNode third=new ListNode(4);
		second.next=third ;
		ListNode forth=new ListNode(5);
		third.next=forth ;
		
		ListNode head2=new ListNode(3);
		ListNode first2=new ListNode(4);
		head2.next=first2;
		first2.next=second ;
		
		ListNode t=getIntersectionNode(head1,head2);
		
		System.out.println(t.data);
	}

}
