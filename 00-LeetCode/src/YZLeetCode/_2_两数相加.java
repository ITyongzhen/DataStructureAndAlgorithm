package YZLeetCode;
//https://leetcode-cn.com/problems/add-two-numbers/
public class _2_两数相加 {
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
		  int tag = 0;
		  ListNode newHead = new ListNode(0);
		  ListNode newTail= newHead;
		  while (l1 != null || l2 != null || tag != 0) {
			  int sum = tag;
			  if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			  }
			  if (l2 != null) {
					sum += l2.val;
					l2 = l2.next;
				  }
			
			
			tag = sum / 10;
			ListNode node = new ListNode(sum % 10);
			newTail = newTail.next = node;
			
		}
		  
		  return newHead.next;
	    }
}
