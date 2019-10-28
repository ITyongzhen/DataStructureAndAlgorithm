package YZLeetCode;

import java.util.Stack;

// https://leetcode-cn.com/problems/score-of-parentheses/
public class _856_括号的分数 {
	
	public int scoreOfParentheses4(String S) {
		return Helper(S, 0, S.length() -1);
	}
	
	public int Helper(String S, int begin, int end) {
		if (end - begin == 1) {
			return 1;
		}
		int b = 0;
		for(int i = begin; i< end; i++) {
			if (S.charAt(i) == '(') {
				b++;
			}
			if (S.charAt(i) == ')') {
				b--;
			}
			
			if (b == 0) {
				return Helper(S, begin, i) + Helper(S, i + 1, end);
			}
			
		
			
		}
		
		
		return 2 * Helper(S, begin +1, end -1 );
	}
	
	public int scoreOfParentheses3(String S) {
		if (S.equals("")) {
			return 0;
		}
		if (S.equals("(")) {
			return 1;
		}
		
		int pointer = 0;
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			Character c = S.charAt(i);
			if (c == '(') count++;
			if (c == ')') count--;
			pointer++;
			if (count == 0) {
				break;
			}
			
		}
		
	
		if (pointer == S.length()) {
			return 2 * scoreOfParentheses3(S.substring(1, pointer-1));
		}else {
			return scoreOfParentheses3(S.substring(0, pointer)) +  scoreOfParentheses3(S.substring(pointer, S.length()));
		}
		
		
	}
	public int scoreOfParentheses2(String S) {
	       Stack<Integer>stack=new Stack<>();
	       
	        for(int i=0; i<S.length(); i++){
	            if(!stack.isEmpty()&&S.charAt(i)==')'){
	                  if(stack.peek()==-1){
	                      stack.pop();
	                      stack.push(1);
	                  }
	                   else{
	                    int n=stack.pop();
	                       if(stack.peek()==-1){
	                           stack.pop();
	                           stack.push(n*2);
	                       }
	                       else stack.push(n);
	                   }
	            }
	            else stack.push(-1);
	            
	            //add nums
	            int count=0;
	            while(!stack.isEmpty()&&stack.peek()!=-1){
	                count+=stack.pop();
	            }
	            if(count!=0)
	                stack.push(count);
	        }
	        
	        
	        //return
	        return stack.pop();
	    
	}
	public int scoreOfParentheses(String S) {
		  if (S.equals("")) {
	            return 0;
	        }
	        if (S.equals("()")) {
	            return 1;
	        }
	        int count = 0;
	        int pointer = 0;
	        while (pointer < S.length()) {// ((()))() = 8    
	            if (S.charAt(pointer) == '(') {
	                count ++;
	            } else {
	                count --;
	            }
	            pointer ++; // 6
	            if (count == 0) {
	                break;
	            }
	        }
	        if (pointer == S.length()) { //2*(()) -> 
	            return 2 * scoreOfParentheses(S.substring(1, S.length()-1));
	        }
	        return scoreOfParentheses(S.substring(0, pointer)) + 
	                scoreOfParentheses(S.substring(pointer));
	}

}