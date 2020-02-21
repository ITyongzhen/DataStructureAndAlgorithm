package YZLeetCode;

import java.util.Stack;

// https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
public class _150_逆波兰表达式求值 {
	
	 public int evalRPN2(String[] tokens) {
	        int length = tokens.length;
	        Stack<Integer> mystack = new Stack<>();
	        for(int i =0;i<length;i++){
	           switch (tokens[i]) {
			case "+":
				mystack.push(mystack.pop() + mystack.pop());
				break;
			case "-":
				Integer beforeInteger=mystack.pop();
				mystack.push(mystack.pop() - beforeInteger);
				break;
			case "*":
				mystack.push(mystack.pop() * mystack.pop());
				break;
			case "/":
				Integer before = mystack.pop();
				mystack.push(mystack.pop() /before);
				break;
			default:
				mystack.push(Integer.valueOf(tokens[i]));
				break;
			}


	        }
	        return mystack.pop();
	    }
	 
	 
	 public int evalRPN(String[] tokens) {
	        
		 Stack<Integer> stack =  new Stack<>();
		for (int i = 0; i < tokens.length; i++) {
			
//			if (tokens[i] == "+" || tokens[i] == "-" ||tokens[i] == "*" || tokens[i] == "/") {
//				
//			}
			
			switch (tokens[i]) {
			case "+":
				stack.push(stack.pop() + stack.pop());
				break;
			case "-":
				Integer before = stack.pop();
				stack.push(stack.pop() - before);
				break;
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "/":
				Integer one = stack.pop();
				stack.push(stack.pop() / one);
				break;
			default:
				stack.push(Integer.valueOf(tokens[i]));
				break;
			}
		
			
		}
		 
		 return stack.pop();
	    }
}
