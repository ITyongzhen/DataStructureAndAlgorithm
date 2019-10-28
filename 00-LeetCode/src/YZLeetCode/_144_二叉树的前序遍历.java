package YZLeetCode;

import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
public class _144_二叉树的前序遍历 {
	
	
	 public List<Integer> preorderTraversal(TreeNode root) {
		 if(root == null)return new ArrayList<>();
		 List<Integer> list  = new ArrayList<Integer>();
		  return pre2(root,list);
	 }
	 // 循环
	 private List<Integer> pre2(TreeNode root,List<Integer> list) {
		 Stack<TreeNode> stack = new Stack<>();
		 stack.push(root);
		 
		 while (!stack.isEmpty()) {
			 TreeNode node = stack.pop();
				list.add(node.val);
				
				if (node.right != null) {
					stack.push(node.right);
				}
				if (node.left != null) {
					stack.push(node.left);
				}
			}
		      
		    return list;
	 }
	 // 递归
	 private List<Integer> pre1(TreeNode root,List<Integer> list) {
		 	if (root == null) {
				return null;
			}
		 	list.add(root.val);
		 	pre1(root.left,list);
		 	pre1(root.right,list);
	        return list;
	}
	 
}
