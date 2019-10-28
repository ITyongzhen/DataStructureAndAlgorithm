package YZLeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/submissions/
public class _653_两数之和IV输入BST {
	
	Stack<Integer> stack = new Stack<>();
	 boolean res =false;
	 public boolean findTarget(TreeNode root, int k) {

	     Map<Integer, TreeNode> map = new HashMap<>();
	    
	     inOrderTraversal2(root, map, k);
		 
		 return res;
		 
	 }
	 private void inOrderTraversal2(TreeNode node, Map<Integer, TreeNode> map,int k) {
			if (node == null) {
				return ;
			}
			if (map.containsKey(k-node.val)) {
				res = true;
				return;
			}else {
				map.put(node.val, node);

			}
			
			if (node.left != null) {
				inOrderTraversal2(node.left, map,k);
			}
		
			if (node.right != null) {
				inOrderTraversal2(node.right, map,k);
			}
			
		}
	 
	 
	 
	 
	 
	 
	 public boolean findTarget2(TreeNode root, int k) {
	
	     Map<Integer, TreeNode> map = new HashMap<>();
	     inOrderTraversal(root, map);
	     int temp;
	     int value;
	    while (!stack.isEmpty()) {
			
			value = stack.pop();			
			temp = k - value;
			map.remove(value);
			if (map.containsKey(temp)) {
				return true;
			}
		}
	     return false;
	    }
	 
	 	private void inOrderTraversal(TreeNode node, Map<Integer, TreeNode> map) {
			if (node == null) {
				return ;
			}
			
			if (node.left != null) {
				inOrderTraversal(node.left, map);
			}
			map.put(node.val, node);
			stack.push(node.val);
			if (node.right != null) {
				inOrderTraversal(node.right, map);
			}
			
		}
	 
}
