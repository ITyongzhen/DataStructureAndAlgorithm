package YZLeetCode;
//https://leetcode-cn.com/problems/merge-k-sorted-lists/
public class _23_合并K个排序链表 {
	
	
	private void name() {
//		计算最少出列多少位同学，使得剩下的同学排成合唱队形
//		说明：
//		N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
//		合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK， 
//		则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
//		你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
		
		
	}
	
	
	
	
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
