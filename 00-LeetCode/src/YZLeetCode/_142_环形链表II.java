package YZLeetCode;
//https://leetcode-cn.com/problems/linked-list-cycle-ii/
public class _142_环形链表II {
	public class Solution {

	    private ListNode getNode(ListNode head){
	        if(head==null || head.next == null) return null;
	                ListNode fast = head;
	                ListNode slow = head;

	                while(fast != null && fast.next != null){
	                    slow = slow.next;
	                    fast = fast.next.next;
	                    if(slow == fast) return slow;
	                }
	        return null;
	    }

	    public ListNode detectCycle(ListNode head) {
	      
	        ListNode fast = getNode(head);
	        if(fast == null) return null;
	       
	        ListNode slow = head;
	        while(true){
	            if(slow == fast)break;
	            slow = slow.next;
	            fast = fast.next;
	            
	        }
	        return slow;
	    }
	}
}
