package YZLeetCode;

public class _234_回文链表 {
	
	 public boolean isPalindrome2(ListNode head) {
			if (head == null || head.next == null) {
				return true;
			}

			ListNode midNode = getMiddleNode(head);
			ListNode leftNode = head;
			ListNode rightNode = recover(midNode);

			while (rightNode != null) {
				if (leftNode.val != rightNode.val) {
					return false;
				}
				leftNode = leftNode.next;
				rightNode = rightNode.next;
			}
			return true;

		}

		private ListNode getMiddleNode(ListNode node) {
			ListNode slowNode = node;
			ListNode fastNode = node;
			while (fastNode != null && fastNode.next != null) {
				slowNode = slowNode.next;
				fastNode = fastNode.next.next;
			}
			return slowNode;
		}

		private ListNode recover(ListNode node) {
		
			
			
		//申请节点，pre和 cur，pre指向null
				ListNode pre = null;
				ListNode cur = node;
				ListNode tmp = null;
				while(cur!=null) {
					//记录当前节点的下一个节点
					tmp = cur.next;
					//然后将当前节点指向pre
					cur.next = pre;
					//pre和cur节点都前进一位
					pre = cur;
					cur = tmp;
				}
				return pre;

		}

		 
		 
		 
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
