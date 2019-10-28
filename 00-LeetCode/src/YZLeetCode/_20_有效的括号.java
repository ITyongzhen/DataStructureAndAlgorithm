package YZLeetCode;

import java.util.HashMap;

import java.util.Stack;

// https://leetcode-cn.com/problems/valid-parentheses/solution/
public class _20_有效的括号 {
	
	static HashMap<Character, Character> map = new HashMap<>();
	
	static {
		map.put('[', ']');
		map.put('(', ')');
		map.put('{', '}');
	}
//	public _20_有效的括号() {
//		map.put('[', ']');
//		map.put('(', ')');
//		map.put('{', '}');
//	}
	
	 public boolean isValid2(String s) {
		 Stack<Character> stack = new Stack<>();
		 int len = s.length();
		 for(int i = 0;i<len;i++) {
			 char c = s.charAt(i);
			 if (map.containsKey(c)) {
					stack.push(c);
				}else {
					if (stack.isEmpty()) {
						return false;
					}
					
					char left = stack.pop();
					if (c != map.get(left))
					return false;
				}
		 }
		 
		 
		 return stack.isEmpty();
	 }
	 
	 public boolean isValid(String s) {
	     Stack<Character> stack = new Stack<>();
	     int len = s.length();
	     for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '{') {
				stack.push(c);
			}else {
				if (stack.isEmpty()) {
					return false;
				}
				
				char left = stack.pop();
				if ((left == '(' && c == ')') || (left == '[' && c == ']') || (left == '{' && c == '}')) {
					
				}else {
					return false;
				}
			}
					
		}
	    
		 return stack.isEmpty();
	    }
}
