package LinkedList6;

public class LinkedListPalindrome {
	
	public boolean isPalindrome(ListNode head)
	{
		if(head==null||head.next==null)
		return true ;

	    if(head.next.next==null)
	    {
	        if(head.data==head.next.data) return true ;
	        else return false;
	    }
		ListNode slow=head ;
		ListNode fast=head ;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next ;
			fast=fast.next.next ;
		}
		ListNode prev=null;
		ListNode curr=slow;
		while(curr!=null)
		{
			ListNode next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next ;
		}
		slow=prev;
		fast=head ;
		
		while(slow!=null)
		{
			if(fast.data==slow.data)
			{
				fast=fast.next  ;
				slow=slow.next ;
			}
			else {
				return false ;
			}
		}
		return true ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
