package YZLeetCode;

public class _234_回文链表 {
	 public boolean isPalindrome(ListNode head) {
	        
	        if(head == null)return true;
	        
	        ListNode fast = head;
	        ListNode slow = head;
	        ListNode reversed = null;
	        
	        // 循环的时候，前半段翻转
	        while(fast != null && fast.next != null){
	             ListNode temp = slow;
	             slow = slow.next;
	            fast = fast.next.next;
	            
	            temp.next = reversed;
	            reversed = temp;
	            
	           
	            
	        }
	        
	        if(fast != null)slow = slow.next;
	        
	        while(slow!=null){
	           if( slow.val != reversed.val) return false;
	            slow = slow.next;
	            reversed = reversed.next;
	        }
	        
	        return true;
	    }
}
