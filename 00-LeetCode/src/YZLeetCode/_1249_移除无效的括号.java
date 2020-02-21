package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/minimum-remove-to-make-valid-parentheses/
public class _1249_移除无效的括号 {
	
	public static void main(String[] args) {
		minRemoveToMakeValid("))((");
	}
	
	static public String minRemoveToMakeValid(String s) {
	     
		 Stack<Integer> stack = new Stack<>();
		 boolean[] boolArr = new boolean[s.length()]; //false 代表有效，   true否则为无效
		
		 StringBuffer stringBuffer = new StringBuffer();
		 for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
				boolArr[i] = true;
			}
			if (s.charAt(i) ==')') {
				if (stack.isEmpty()) {
					boolArr[i] = true;
				}else {
					boolArr[stack.pop()] = false;
				}
			}
			 
			 
		}
		 
		 for (int i = 0; i < s.length(); i++) {
			if (!boolArr[i]) {
				stringBuffer.append(s.charAt(i));
			}
		}
		 
		 
		 return stringBuffer.toString();
	    }
}
