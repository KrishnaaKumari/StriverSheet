package StackQueue13;

import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    Queue<Integer> queue;
    
    public MyStack() {
        queue= new LinkedList<>();
    }
    
    public void push(int x) {
        int size=queue.size();
        queue.add(x);
        for(int i=0 ; i<size ; i++)
        queue.add(queue.remove());
    }
    
    public int pop() {
        if(queue.size()==0)
        return -1;
        else{
            return queue.remove();
        }
    }
    
    public int top(){
        if(queue.size()==0)
        return -1;
        else{
            return queue.peek();
        }
    }
    
    public boolean empty() {
        if(queue.size()==0)
        return true;
        else 
        return false ;
    }
}

public class ImplementStackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input
//		["MyStack", "push", "push", "top", "pop", "empty"]
//		[[], [1], [2], [], [], []]
//		Output
//		[null, null, null, 2, 2, false]
		
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.empty());

	}

}
