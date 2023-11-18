package StackQueue13;

import java.util.Stack;
public class SortStack {
	
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.isEmpty())
		return ;
		int top=stack.pop();
		sortStack(stack);
		sortInsert(stack,top);
	}
	public static void sortInsert(Stack<Integer> stack, int top)
	{
		if(stack.isEmpty()||top>=stack.peek())
		{
			stack.push(top);
			return ;
		}

		int curr=stack.pop();
		sortInsert(stack, top);
		stack.push(curr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
