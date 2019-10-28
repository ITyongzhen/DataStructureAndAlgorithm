package YZLeetCode;

import javax.xml.transform.Templates;

// https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/
public class _21_合并两个有序链表 {
public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
	
		if (l1.val<l2.val) {
			l1.next = mergeTwoLists2(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists2(l1, l2.next);
			return l2;
		}
		
    }
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		ListNode newNode = new ListNode(0);
		ListNode temp=newNode;
		
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				l1=l1.next;
			}else {
				temp.next = l2;
				l2=l2.next;
			}
			
		}
		if (l1 != null) {
		
			temp.next = l1;
		}
		if (l2 != null) {
			temp.next = l2;
		}
		
		return newNode.next;
    }
}
