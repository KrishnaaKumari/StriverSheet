package StackQueue13;

import java.util.Stack;
class MyQueue {
    Stack<Integer>s;
    Stack<Integer>help;
    public MyQueue() {
        s=new Stack<>();
        help=new Stack<>();
    }
    
    public void push(int x) {
        while(!s.isEmpty())
        help.push(s.pop());
        s.push(x);
        while(!help.isEmpty())
        s.push(help.pop());
    }
    
    public int pop() {
        if(s.isEmpty())
        return -1;
        else
        return s.pop();
    }
    
    public int peek() {
        if(s.isEmpty())
        return -1;
        else {
            return s.peek();
        }
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}
public class ImplementQueueUsingStack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
