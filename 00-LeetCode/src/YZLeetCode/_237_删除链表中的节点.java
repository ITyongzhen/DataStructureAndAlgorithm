package YZLeetCode;
// https://leetcode-cn.com/problems/delete-node-in-a-linked-list/comments/
public class _237_删除链表中的节点 {
	
	  public void deleteNode(ListNode node) {
		  node.val = node.next.val;
		  node.next = node.next.next;
	    }
}
