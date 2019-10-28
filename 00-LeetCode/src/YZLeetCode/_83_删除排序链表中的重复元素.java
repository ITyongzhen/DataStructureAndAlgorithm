package YZLeetCode;

import java.util.HashMap;
import java.util.HashSet;

// https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
public class _83_删除排序链表中的重复元素 {
	 public ListNode deleteDuplicates2(ListNode head) {
	  if (head == null){
          return null;
      }
      ListNode node = head;	//使用临时指针
      while (node.next != null) {
          if (node.val == node.next.val) {
              node.next = node.next.next;
          }else{
              node = node.next;
          }
      }
      return head;
  }
	
//	 public ListNode deleteDuplicates(ListNode head) {
//	        
//		 HashSet<Integer> hash = new HashSet<>();
//		 ListNode newHead = head;
//		 ListNode cur = newHead;
//		 
//		 while (cur.next != null) {
//			if (hash.contains(cur.val)) {
//				cur.val = cur.next.val;
//				cur.next = cur.next.next;
//			}else {
//				hash.add(cur.val);
//				cur = cur.next;
//			}
//		}
//		 return newHead;
//	    }
	
}
