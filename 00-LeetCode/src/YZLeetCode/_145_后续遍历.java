package YZLeetCode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


// https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
public class _145_后续遍历 {
	 public List<Integer> postorderTraversal(TreeNode root) {
	        List<Integer> list = new ArrayList<>();
	        if (root == null) {
				return list;
			}
	        
	        return postorderTraversal1(root, list);
	    }
	 
	 	private List<Integer> postorderTraversal1(TreeNode root,List<Integer> list) {
	 		if (root==null) {
				return null;
			}
	        postorderTraversal1(root.left, list);
	        postorderTraversal1(root.right, list);
	        list.add(root.val);
	        return list;
	    }
	 
	 private List<Integer> postorderTraversal2(TreeNode root,List<Integer> list) {
		 LinkedList<TreeNode> stack = new LinkedList<>();
		    LinkedList<Integer> output = new LinkedList<>();
		    if (root == null) {
		      return output;
		    }

		    stack.add(root);
		    while (!stack.isEmpty()) {
		      TreeNode node = stack.pollLast();
		      output.addFirst(node.val);
		      if (node.left != null) {
		        stack.add(node.left);
		      }
		      if (node.right != null) {
		        stack.add(node.right);
		      }
		    }
		    return output;

	
	    }
}
