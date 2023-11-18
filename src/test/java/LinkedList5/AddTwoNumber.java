package LinkedList5;

public class AddTwoNumber {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		int carry=0;
		ListNode dummy= new ListNode(0);
		ListNode temp=dummy ;
		while(l1!=null||l2!=null||carry==1)
		{
			int sum=0 ;
			sum=sum+carry;
			if(l1!=null)
			{
				sum=sum+l1.data ;
				l1=l1.next;
			}
			if(l2!=null)
			{
				sum=sum+l2.data ;
				l2=l2.next;
			}
			carry=sum/10 ;
			ListNode newnode=new ListNode(sum%10);
			temp.next=newnode ;
			temp=temp.next ;
		}
		return dummy.next ;
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

		ListNode head1= new ListNode(1);
		ListNode first1= new ListNode(2);
		head1.next=first1 ;
		ListNode second1= new ListNode(4);
		first1.next=second1 ;
		
		ListNode head2= new ListNode(1);
		ListNode first2= new ListNode(3);
		head2.next=first2 ;
		ListNode second2= new ListNode(9);
		first2.next=second2 ;
		
		ListNode h=addTwoNumbers(head1,head2);
		printListNode(h);
	}

}
