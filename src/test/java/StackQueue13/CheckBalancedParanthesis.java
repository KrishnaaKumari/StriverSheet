package StackQueue13;

import java.util.Stack;
public class CheckBalancedParanthesis {
	
	 public static boolean isValid(String s) {
	        Stack<Character>stack=new Stack<>();
	        for(int i=0 ; i<s.length() ; i++)
	        {
	            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
	                stack.push(s.charAt(i));
	            else{

	                if(stack.isEmpty())
	                return false ;

	                if(stack.peek()=='[')
	                {
	                    if(s.charAt(i)!=']')
	                        return false ;
	                    else
	                        stack.pop();
	                }
	                else if(stack.peek()=='{')
	                {
	                    if(s.charAt(i)!='}')
	                        return false ;
	                    else
	                        stack.pop();
	                }
	                else if(stack.peek()=='(')
	                {
	                    if(s.charAt(i)!=')')
	                        return false ;
	                    else
	                        stack.pop();
	                }

	            }
	        }
	        if(stack.isEmpty()==true)
	            return true;
	        else
	        return false ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
