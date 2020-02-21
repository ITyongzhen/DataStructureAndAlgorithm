package YZLeetCode;

public class _面试题_02_07_链表相交 {
	  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	      if (headA == null || headB == null) {
			return null;
		}  
		  ListNode PA= headA;
		  ListNode PB= headB;
	      
		  while (PA != PB) {
			PA = (PA == null)? headB: PA.next;
			PB = (PB == null)? headA: PB.next;
		 }
		  
		  return PA;
	      		  
	    }
}
