package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/
public class _921_使括号有效的最少添加 {
	 public int minAddToMakeValid(String S) {
	        Stack<Character> stack = new Stack<>();
	       for (int i = 0;i<S.length();i++) {
			Character c=S.charAt(i);
			if (stack.isEmpty()) {
				stack.push(c);
				continue;
			}
			if (c=='(') {
					stack.push(c);
			}else {
				if (stack.peek() == '(') {
					stack.pop();
				}else {
					stack.push(c);
				}
			}
	    	   
	       }
	        return stack.size();
	    }
}
