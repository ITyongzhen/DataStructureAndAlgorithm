package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode-cn.com/problems/binary-tree-right-side-view/
public class _199_二叉树的右视图 {
	 public List<Integer> rightSideView(TreeNode root) {
		 List<Integer> list = new ArrayList<>();
		 if (root == null)return list;
		 
		 Queue<TreeNode> queue = new LinkedList<>();
		 queue.add(root);
		 int size = 1;
		 while (!queue.isEmpty()) {
			
			TreeNode node = queue.poll();
			
			
			if (node.left!=null) {
				queue.add(node.left);
			}
			
			if (node.right!=null) {
				queue.add(node.right);
			}
			size--;
			if (size == 0) {
				list.add(node.val);
				size = queue.size();
			}
			
		 }
		 
		 return list;
	    }
	 
	 
}
