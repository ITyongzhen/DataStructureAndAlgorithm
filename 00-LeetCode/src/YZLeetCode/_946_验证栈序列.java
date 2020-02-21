package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

// https://leetcode-cn.com/problems/validate-stack-sequences/
public class _946_验证栈序列 {
	
	 public boolean validateStackSequences(int[] pushed, int[] popped) {
		 int pushLength = pushed.length;
		 Stack<Integer> stack = new Stack<>();
		 int popIndex = 0;
		 
		for (Integer x : pushed) {
			stack.push(x);
			while (!stack.isEmpty() && popIndex<pushLength && stack.peek() == popped[popIndex]) {
				stack.pop();
				popIndex++;
			}			
		}
		 
		 return pushLength == popIndex;
	 }
	
	
	
	boolean res = true;
	int index = -1;
	int tempIndex = -1;
	 public boolean validateStackSequences2(int[] pushed, int[] popped) {
		 Stack<Integer> poppedstack = new Stack<>();
		 if(popped.length==0 && pushed.length == 0l)return true;
         if(popped.length==0 || pushed.length == 0l)return false;
		for (int i = popped.length-1; i >=0 ; i--) {
			poppedstack.add(popped[i]);
		}
		
		int temp = poppedstack.pop();
		for (int i = 0; i < pushed.length; i++) {
			if (pushed[i] == temp) {
				index = i;
				pushed[index] = -1;
				break;
			}
		}
		
		while (!poppedstack.isEmpty()) {
			temp = poppedstack.pop();
			
			if (getLeft(pushed, index) == temp) {
				index = tempIndex;
				pushed[index] = -1;
			}else if (getRight(pushed, index) == temp) {
				index = tempIndex;
				pushed[index] = -1;
			}else {
				res = false;
				break;
			}
			
		}
		 return res ;
	    }
	 
	 private int getLeft(int[] pushed,int theInde) {
		 if (theInde<0) {
			 return getLeft(pushed, pushed.length-1);
		}
		if (pushed[theInde] == -1) {
			return getLeft(pushed, theInde-1);
		}else {
			tempIndex = theInde;
			return pushed[theInde];
		}
		
	}
	 
	 private int getRight(int[] pushed,int theInde) {
		 if (theInde>=pushed.length) {
			return -2;
		}
		if (pushed[theInde] == -1) {
			return getRight(pushed, theInde+1);
		}else {
			tempIndex = theInde;
			return pushed[theInde];
		}
		
	}
	 
	 
}
