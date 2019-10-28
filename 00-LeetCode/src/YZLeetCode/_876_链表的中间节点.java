package YZLeetCode;
//https://leetcode-cn.com/problems/middle-of-the-linked-list/solution/
public class _876_链表的中间节点 {
	 public ListNode middleNode(ListNode head) {
	        
		 ListNode fast = head;
		 ListNode slow = head;
		 while (fast != null && fast.next != null ) {
			slow = slow.next;
			fast = fast.next.next;
		}
		 
		 return slow;
	    }
}
