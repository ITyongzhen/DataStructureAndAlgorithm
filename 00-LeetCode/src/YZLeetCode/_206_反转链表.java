package YZLeetCode;
//https://leetcode-cn.com/problems/reverse-linked-list/
public class _206_反转链表 {
	// 循环
public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode newHead = null;
		
		while (head != null) {
			ListNode temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
			
		}
		
		
		return newHead;
		
    }
	// 递归
	public ListNode reverseList(ListNode head) {
        
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode temp = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
		
    }
}
