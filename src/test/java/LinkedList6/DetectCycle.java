package LinkedList6;

public class DetectCycle {
	
	public static boolean hasCycle(ListNode head) {
		if(head==null)
			return true ;
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next ;
			if(slow==fast)
				return true ;
		}
		return false ;
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
		forth.next=second ;
		System.out.println(hasCycle(head1));

	}

}
