package YZLeetCode;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode-cn.com/problems/implement-stack-using-queues/
public class _225_用队列实现栈 {
	
	private Queue<Integer> que1 ;
	private Queue<Integer> que2;
	/** Initialize your data structure here. */
    public _225_用队列实现栈() {
        que1 = new LinkedList<>();
        que2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
       que1.offer(x);
       while (!que2.isEmpty()) {
		que1.offer(que2.poll());
		
	}
       Queue<Integer> temp = que1;
       que1 = que2;
       que2 = temp;
       
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       return que2.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return que2.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return que2.isEmpty();
    }
}
