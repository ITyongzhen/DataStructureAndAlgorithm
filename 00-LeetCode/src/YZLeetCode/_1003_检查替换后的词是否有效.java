package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/check-if-word-is-valid-after-substitutions/
public class _1003_检查替换后的词是否有效 {
	
	public static void main(String[] args) {
		boolean res = isValid("aabcbc");
		System.out.println(res);
	}
	
	static public boolean isValid(String S) {
	        char[] Sarr = S.toCharArray();
	        Stack<Character> stack = new Stack<>();
	        		
	        for (Character character : Sarr) {
				if (character=='a' || character=='b') {
					stack.push(character);
				}else {
					if ( stack.size()<2 || !stack.pop().equals('b')) {
						return false;
					}
					
					if ( stack.size()<1 || !stack.pop().equals('a')) {
						return false;
					}
					
					
					
					
				}
			}
		 
	        return stack.isEmpty();
		 
	    }
}
