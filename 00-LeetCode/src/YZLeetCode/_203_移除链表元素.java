package YZLeetCode;

// https://leetcode-cn.com/problems/remove-linked-list-elements/
public class _203_移除链表元素 {
	  public ListNode removeElements(ListNode head, int val) {
	      
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		
		ListNode cur = newHead;
		while(cur.next != null ) {
			if (cur.next.val == val) {
				cur.next = cur.next.next;
			}else {
				cur = cur.next;
			}
		}	
		  
		  return newHead.next;
	    }
}
	