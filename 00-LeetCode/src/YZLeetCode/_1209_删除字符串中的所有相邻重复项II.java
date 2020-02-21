package YZLeetCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string-ii/
public class _1209_删除字符串中的所有相邻重复项II {
	
	public static void main(String[] args) {
		String string = removeDuplicates("pbbcggttciiippooaais", 2);
		System.out.println(string);
	}
	
	static public String removeDuplicates(String s, int k) {
        
		 Stack<Character> stack = new Stack<>();
		 int total = 1;
		
		 char[] charArr = s.toCharArray();
		 Character preCharacter = charArr[0] ;
		 stack.push(preCharacter);
		 for (int i = 1;i<charArr.length;i++) {
			 Character character =  charArr[i];
			 if (preCharacter.equals(character)) {
				total++;
				 if (total == k) { //移除
					 while (total>1) {
							stack.pop();
							total--;
					}
				}else {
					stack.push(character);
				}
			 }else {
				total = 1;
				preCharacter = character;
				stack.push(character);
				
			}
		}
		 
		 Stack<Character> stack2 = new Stack<>();
		 
		 while (!stack.isEmpty()) {
			 stack2.push(stack.pop());
		 }
		 
		 
		 StringBuffer stringBuffer = new StringBuffer();
		
		 while (!stack2.isEmpty()) {
				stringBuffer.append(stack2.pop());
			}
		 
		 return stringBuffer.toString();
	    }
	
	static public String removeDuplicates2(String s, int k) {
	        
		Deque<Character> queue = new LinkedList<>();
		 
		 for (Character character : s.toCharArray()) {			
			int sum = 1;
			while (!queue.isEmpty() && queue.peekLast().equals(character)) {
				queue.pollLast();
				sum++;
			}
			if (sum != k) {
				while (sum>0) {
					queue.push(character);
					sum--;
				}
			}
			
		}
		 
		 StringBuffer stringBuffer = new StringBuffer();
		while (!queue.isEmpty()) {
			stringBuffer.append(queue.getFirst());
		}
		 
		 
		 return stringBuffer.toString();
	    }
	 
	//超出时间限制
	static public String removeDuplicates3(String s, int k) {
	        
		 Stack<Character> stack = new Stack<>();
		 
		 for (Character character : s.toCharArray()) {			
			int sum = 1;
			while (!stack.isEmpty() && stack.peek().equals(character)) {
				stack.pop();
				sum++;
			}
			if (sum != k) {
				while (sum>0) {
					stack.push(character);
					sum--;
				}
			}
			
		}
		 
		 Stack<Character> stack2 = new Stack<>();
		 
		 while (!stack.isEmpty()) {
			 stack2.push(stack.pop());
		 }
		 
		 
		 StringBuffer stringBuffer = new StringBuffer();
		
		 while (!stack2.isEmpty()) {
				stringBuffer.append(stack2.pop());
			}
		 
		 return stringBuffer.toString();
	    }
}
