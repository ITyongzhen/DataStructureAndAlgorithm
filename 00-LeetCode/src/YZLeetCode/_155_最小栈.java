package YZLeetCode;

import java.util.LinkedList;
import java.util.Stack;

// https://leetcode-cn.com/problems/min-stack/
public class _155_最小栈 {
	 /** initialize your data structure here. */
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
    public _155_最小栈() {
        
    }
    
    public void push(int x) {
    	if (stack2.isEmpty() || stack2.peek() >= x) {
    		stack2.push(x);
		}
  
        stack1.push(x);
    }
    
    public void pop() {
    	int k = stack1.pop();
        if (stack2.peek() == k) {
			stack2.pop();
		}
    }
    
    public int top() {
       return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
