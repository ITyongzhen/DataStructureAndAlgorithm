package YZLeetCode;


import java.util.ArrayList;
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
	        Stack<TreeNode> stack = new Stack<>();
	       
	        while (!stack.isEmpty()) {
	        	TreeNode node = stack.pop();
				stack.push(root.left);
				stack.push(root.right);
				list.add(node.val);
			}
	        
	        return list; 
	    }
}
