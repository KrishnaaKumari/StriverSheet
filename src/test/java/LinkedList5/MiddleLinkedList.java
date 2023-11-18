package LinkedList5;

public class MiddleLinkedList {

	public static ListNode middleNode(ListNode head) {
		if(head==null)
			return null ;
		
		ListNode slow=head ;
		ListNode fast=head ;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next ;
			fast=fast.next.next ;
		}
		return slow ;
        
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
		
		ListNode newnode=middleNode(head);
		System.out.println(newnode.data);
	}

}
