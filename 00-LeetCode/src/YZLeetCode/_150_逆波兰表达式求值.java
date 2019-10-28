package YZLeetCode;

import java.util.Stack;

// https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
public class _150_逆波兰表达式求值 {
	
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
