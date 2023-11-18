package LinkedList5;

public class MergeTwoSortedList {
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
	{
		if(list1==null)
			return list2 ;
		if(list2==null)
			return list1;
		
		ListNode head=new ListNode(0);
		ListNode temp=head ;
		while(list1!=null && list2!=null)
		{
			if(list1.data<list2.data)
			{
				temp.next=list1;
				temp=temp.next;
				list1=list1.next ;
			}
			else {
				temp.next=list2;
				temp=temp.next;
				list2=list2.next ;
			}
		}
		while(list1!=null)
		{
			temp.next=list1;
			temp=temp.next;
			list1=list1.next ;
		}
		while(list2!=null)
		{
			temp.next=list2;
			temp=temp.next;
			list2=list2.next ;
		}
		return head.next ;
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
		ListNode second2= new ListNode(4);
		first2.next=second2 ;
		
		ListNode h=mergeTwoLists(head1,head2);
		printListNode(h);
	}

}
