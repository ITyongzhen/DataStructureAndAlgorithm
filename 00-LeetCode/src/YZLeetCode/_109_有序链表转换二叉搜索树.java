package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/
public class _109_有序链表转换二叉搜索树 {
	
	List<Integer> values;
	
	 public TreeNode sortedListToBST(ListNode head) {
	        values = new ArrayList<>();
	        changeListNodeToArrayList(head);
		 return convertListToBST(0, values.size() -1);
	        
	    }
	 
	 private void changeListNodeToArrayList(ListNode node) {
		 while (node != null) {
			values.add(node.val);
			node = node.next;
		}
	 }
	 
	 
	 private TreeNode convertListToBST(int left,int right) {
		 if (left>right) {
			return null;
		}
		 int mid = (left + right)/2;
		 TreeNode node = new TreeNode(this.values.get(mid));
		 if (left == right) {
			return node;
		}
		 node.left = convertListToBST(left, mid-1);
		 node.right = convertListToBST(mid+1, right);
		 return node;
		 
	 }
}
