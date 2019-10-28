package YZLeetCode;
//https://leetcode-cn.com/problems/merge-k-sorted-lists/
public class _23_合并K个排序链表 {
	
	 public ListNode mergeKLists2(ListNode[] lists) {
		 if (lists == null || lists.length == 0) return null;
		 if (lists.length == 1) return lists[0];
			
		 int length = lists.length;
		 int size = length;
		 while (size != 1) {
            
			 for (int i = 0; i < (length>>1); i++) {
				 lists[i] = mergeTwoLists(lists[i], lists[length -i-1]);
				 lists[length -i-1] = null;
				 size--;
			 }
			length = length - (length>>1);
		}
		 
		 return lists[0];
	 }
	
	 public ListNode mergeKLists(ListNode[] lists) {
		 if (lists == null || lists.length == 0) return null;
		 if (lists.length == 1) return lists[0];
		 ListNode res =lists[0];
	     for (int i = 1; i < lists.length; i++) {
			res =mergeTwoLists(lists[i], res);
			
	     }   
		 
		 
		 return res;
	    }
	
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
	
		if (l1.val<l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
		
    }
}
