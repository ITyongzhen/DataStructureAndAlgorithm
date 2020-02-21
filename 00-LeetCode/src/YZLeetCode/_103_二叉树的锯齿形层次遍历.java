package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
public class _103_二叉树的锯齿形层次遍历 {
	 static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		 
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 if (root == null ) {
				return res;
			}
		 List<Integer> curtemp = new ArrayList<>();
		 
		 Stack<TreeNode> stack = new Stack<>();
		 stack.push(root);
		 int curCount = 1; //当前层剩余数量
		 int nextCount = 0; //下一层的数量
		 boolean falg = true; //标记左边还是右边遍历 true 时候从左向右  false时候，从右向左
		
		 LinkedList<TreeNode> queue = new LinkedList<>();
		 queue.add(root);
		 TreeNode curNode;
		 
		 while (!queue.isEmpty()) {
			if (falg) {
				curNode = queue.pollFirst();
				curtemp.add(curNode.val);
				if (curNode.left != null) {
					queue.addLast(curNode.left);
					nextCount++;
				}
				
				if (curNode.right != null) {
					queue.addLast(curNode.right);
					nextCount++;
				}
				
				
			}else { //从右向左
				curNode = queue.pollLast();
				curtemp.add(curNode.val);
				
				if (curNode.right != null) {
					queue.addFirst(curNode.right);
					nextCount++;
				}
				
				if (curNode.left != null) {
					queue.addFirst(curNode.left);
					nextCount++;
				}
			}
			 curCount--;
			 
			 if (curCount == 0) {//当前这一行结束
				curCount = nextCount;
				nextCount = 0;
				falg = !falg;
				res.add(new ArrayList<>(curtemp));
				curtemp.clear();				 
			}
		}
		 
		 return res;
	    }
	 
	 
	 
	 
	 
}
