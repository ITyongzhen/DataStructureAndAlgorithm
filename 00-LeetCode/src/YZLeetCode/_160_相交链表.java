package YZLeetCode;
// https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
public class _160_相交链表 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    if (headA == null || headB == null) return null;
	    ListNode pA = headA, pB = headB;
	    while (pA != pB) {
	        pA = pA == null ? headB : pA.next;
	        pB = pB == null ? headA : pB.next;
	    }
	    return pA;
	}
}
