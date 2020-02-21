package YZLeetCode;
//https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
public class _两个链表的第一个公共节点 {
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if (headA == null || headB == null) return null;
        ListNode PA = headA;
        ListNode PB = headB;
        while(PA != PB){
            PA = (PA == null) ? headB: PA.next;
            PB = (PB == null) ? headA: PB.next;
        }

        return PA;

    }
}
