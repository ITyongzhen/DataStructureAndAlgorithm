package YZLeetCode;
//https://leetcode-cn.com/problems/swap-nodes-in-pairs/
public class _24_两两交换链表中的节点 {
	
	 public ListNode swapPairs(ListNode head) {
		 if (head == null || head.next == null) {
				return head;
			}
		 ListNode dump= new ListNode(0);
		 dump.next = head;
		 ListNode pre= dump;
		
		 while (head != null && head.next != null) {
				ListNode firsListNode = head;
				ListNode secondListNode = head.next;
				
				pre.next = secondListNode;
				//交换
				firsListNode.next = secondListNode.next;
				secondListNode.next = firsListNode;
				
				pre = firsListNode;
				head = firsListNode.next;
				
		}
		 
		 
		 return dump.next;
		 
	 }
	 public ListNode swapPairs2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode firsListNode = head;
		ListNode secondListNode = head.next;
		
		firsListNode.next = swapPairs(secondListNode.next);
		secondListNode.next = firsListNode;
		
		return secondListNode; 
	    }
}
