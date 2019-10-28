package YZLeetCode;

import java.util.Stack;

// https://leetcode-cn.com/problems/backspace-string-compare/
public class _844_比较含退格的字符串 {
	
    public boolean backspaceCompare2(String S, String T) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c: S.toCharArray()) {
        	if (c == '#') {
        		if (!stack.isEmpty()) {
        			stack.pop();
        		}
        	}else {
        		stack.push(c);
        	}
        }
 		 for (char t: T.toCharArray()) {
 				
 				if (t=='#') {
 					if (!stack2.isEmpty()) {
 						stack2.pop();
 					}
 				}else {
 					stack2.push(t);
 				}
 		 }
        
 		 StringBuffer s1 = new StringBuffer();
 		 while (!stack.isEmpty()) {
			s1.append(stack.pop());
		}
 		 StringBuffer t1 = new StringBuffer();
 		while (!stack2.isEmpty()) {
			t1.append(stack2.pop());
		}
   	
   	
   	return s1.toString().equals(t1.toString());
 }
    public boolean backspaceCompare(String S, String T) {
       Stack<Character> stack = new Stack<>();
       Stack<Character> stack2 = new Stack<>();
       for (int i = 0; i < S.length(); i++) {
		Character c = S.charAt(i);
		if (c.equals('#')) {
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}else {
			stack.push(c);
		}
       }
		 for (int k = 0; k < T.length(); k++) {
				Character t = T.charAt(k);
				if (t.equals('#')) {
					if (!stack2.isEmpty()) {
						stack2.pop();
					}
				}else {
					stack2.push(t);
				}
		 }
       
		
    

		 while (!stack.isEmpty() && !stack2.isEmpty()) {
			if (!stack.pop().equals(stack2.pop())) {
				return false;
			}
		 }
  	
  	
  	return stack.isEmpty() && stack2.isEmpty();
}
}