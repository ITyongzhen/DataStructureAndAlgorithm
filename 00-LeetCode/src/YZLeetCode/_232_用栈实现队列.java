package YZLeetCode;
// https://leetcode-cn.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class _232_用栈实现队列 {
	 /** Initialize your data structure here. */
	Stack<Integer> stackOne = new Stack<>();
	Stack<Integer> stackTwo = new Stack<>();
    public _232_用栈实现队列() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	stackOne.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	checkStackTwo();
        return stackTwo.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        checkStackTwo();
        return stackTwo.peek();
    }
    
    private void checkStackTwo() {
    	
        if (stackTwo.isEmpty()) {
			while (!stackOne.isEmpty()) {
				stackTwo.push(stackOne.pop());
			}
		}
	}
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }
}
