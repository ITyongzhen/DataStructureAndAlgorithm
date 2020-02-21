package YZLeetCode;

public class _86_分隔链表 {
	 public ListNode partition(ListNode head, int x) {
	     ListNode leftNode = new ListNode(0);   
	     ListNode rightNode = new ListNode(0); 
	     ListNode leftNodeTail = leftNode;   
	     ListNode rightNodeTail = rightNode;   
	     while (head != null) {
	    	 if (head.val < x) {
				leftNodeTail.next = head;
				leftNodeTail = leftNodeTail.next;
			}else {
				rightNodeTail.next = head;
				rightNodeTail = rightNodeTail.next;

			}
	    	 
	    	 head = head.next;
			
		}
	     rightNodeTail.next = null;
	     leftNodeTail.next = rightNode.next;
	     
		 return leftNode.next;
	    }
	 
	 
}
