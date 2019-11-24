package YZLeetCode;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

//https://leetcode-cn.com/problems/sort-list/
public class _148_排序链表 {
	    public ListNode sortList(ListNode head) {
	        if (head == null || head.next == null) {
				return head;
			}
	    	return sort(head);
	    }
	    
	    private ListNode sort(ListNode head) {
			if (head.next == null) {
				return head;
			}
	    	
			ListNode fast = head;
			ListNode slow = head;
			ListNode temp = null;
			while (fast != null && fast.next != null) {
				temp = slow;
				slow = slow.next;
				fast = fast.next.next;
			}
	    	temp.next = null;
	    	ListNode left = sort(head);
	    	ListNode right = sort(slow);
	    	
	    	
	    	return merge(left, right);
		}
	    
	    
	    private ListNode merge(ListNode left, ListNode right) {
	    	ListNode tempHead = new ListNode(0);
	    	ListNode cur = tempHead;
	    	while (left != null && right != null) {
	    		// 左边小于右边
				if (left.val<right.val) {
					cur.next = left;
					cur = cur.next;
					left = left.next;
				}else {// 左边大于右边
					
					cur.next = right;
					cur = cur.next;
					right = right.next;
				}
	    	}
	    	// 左边还有值
	    	if (left!=null) {
				cur.next =left;
			}
	    	
	    	// 右边还有值
	    	if (right!=null) {
				cur.next =right;
			}
	    	return tempHead.next;
	    }
	    
	
}
