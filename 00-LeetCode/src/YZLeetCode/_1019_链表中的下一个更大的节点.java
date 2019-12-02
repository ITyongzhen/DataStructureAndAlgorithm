package YZLeetCode;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode-cn.com/problems/next-greater-node-in-linked-list/
public class _1019_链表中的下一个更大的节点 {
	public int[] nextLargerNodes(ListNode head) {
     int num = 0;
     Stack<Integer> stack = new Stack<>();
     while (head != null) {
		stack.push(head.val);
		num++;
	}
     
     int[] res = new int[num];
   
     int i = num-1;
     int temp;
     int themax=1;
       while (!stack.isEmpty()) {
		 temp = stack.pop();
		
		 
		 if (i==num-1) {
			 res[i] = 0;
		}else {
			 res[i] = temp;
		}
		 
		 themax=Math.max(themax, temp);
       } 
        
        return res;
    }
}
