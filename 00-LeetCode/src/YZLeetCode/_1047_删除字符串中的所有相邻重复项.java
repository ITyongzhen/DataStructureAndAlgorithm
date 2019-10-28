package YZLeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
public class _1047_删除字符串中的所有相邻重复项 {
	public String removeDuplicates2(String S) {

        	StringBuffer sb = new StringBuffer();
        	int len = 0;
        	for (char character: S.toCharArray()) {
				if (len != 0 && sb.charAt(len-1) == character) {
					sb.deleteCharAt(len - 1);
					len--;
				}else {
					sb.append(character);
					len++;
				}
			}
        	
        	return sb.toString();
        	
    	}

	public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
       
        	for (int i = 0; i < S.length(); i++) {
        		Character c = S.charAt(i);
        		if (stack.isEmpty()) {
        			stack.push(c);
				}else {
					if (c.equals(stack.peek())) {
						stack.pop();
					}else {
						stack.push(c);
					}
				}
        		
			}
        	
        	StringBuffer sb = new StringBuffer();
        	 Stack<Character> stack2 = new Stack<>();
        	while (!stack.isEmpty()) {
				
				stack2.push(stack.pop());
			}
        	
        	while (!stack2.isEmpty()) {
				
        		sb.append(stack2.pop());
			}
        	
        	return sb.toString();
        	
    	}
}
