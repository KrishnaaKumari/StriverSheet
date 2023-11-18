package StackQueue13;

import java.util.*;
class Stack
{
        int size;
        int[]arr;
        int idx;
        int capacity;
        
        Stack(int capacity) {
            // Write your code here.
            arr=new int[capacity];
            size=0;
            idx=-1;
            this.capacity=capacity;
        }
        public void push(int num) {
            // Write your code here.
            if(size<capacity)
            {
                idx++;
                arr[idx]=num;
                size++;
            }
        }
        public int pop() {
            // Write your code here.
            int num=0;
            if(size>0)
            {
                num=arr[idx];
                idx-- ;
                size--;
                return num;
            }
            else
                return -1;
        }
        public int top() {
            // Write your code here.
            if(size>0)
            {
                 int num=arr[idx];
                return num;
            }
            return -1;
           
        }
        public int isEmpty() {
            // Write your code here.
            if(size==0)
            return 1;
            else
            return 0 ;
        }
        public int isFull() {
            // Write your code here.
            if(size==capacity)
            return 1;
            else 
            return 0 ;
        }
}

public class ImplementStackWithArray {

	public static void main(String[] args) {
		Stack s= new Stack(5);
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter option: ");
			int option=sc.nextInt();
			switch(option)
			{
			case 1: System.out.println("Enter number: ");
					int num=sc.nextInt();
					s.push(num);
					break ;
			case 2: System.out.println("pop: "+s.pop());
					break ;
			case 3: System.out.println("peek: "+s.top());
					break ;
			case 4: System.out.println("Stack is Empty: "+s.isEmpty());
					break ;
			case 5: System.out.println("Stack is Full: "+s.isFull());
					break ;
			case -1: return;
		}
		
		}
	}

}
