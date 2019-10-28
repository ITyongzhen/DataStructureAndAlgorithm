package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
public class _94_中序遍历 {
	
	public static void main(String[] args) {
//		_94_中序遍历 a = new _94_中序遍历();
//		a.inorderTraversal(root)
	}
	
	 public List<Integer> inorderTraversal(TreeNode root) {
	       
		 return inorder3(root);

	    }
	 
	 private  List<Integer> inorder3(TreeNode root) {
		 List < Integer > res = new ArrayList < > ();
	        Stack < TreeNode > stack = new Stack < > ();
	        TreeNode curr = root;
	        while (curr != null || !stack.isEmpty()) {
	            while (curr != null) {
	                stack.push(curr);
	                curr = curr.left;
	            }
	            curr = stack.pop();
	            res.add(curr.val);
	            curr = curr.right;
	        }
	        return res;
	 }
	 
	
	 
	 private  List<Integer> inorder1(TreeNode root, List<Integer> list) {
		 if (root == null) {
			return null;
		 }
		 inorder1(root.left, list);
	     list.add(root.val);
	     inorder1(root.right, list);
	        
		 return list;
	    }
	 
	 
}
