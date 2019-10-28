package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.imageio.metadata.IIOInvalidTreeException;

//https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
public class _429_N叉树的层序遍历 {
	// 循环 
	public List<List<Integer>> levelOrder2(Node root) {
		 List<List<Integer>> list = new ArrayList<>();
		 if (root == null) {
				return list;
			}
		 Queue<Node> queue = new LinkedList<>();
		 queue.offer(root);
		 while (!queue.isEmpty()) {
			 int num = queue.size();
			 List<Integer> newList = new ArrayList<>();
			 while (num-- >0) {
				Node node = queue.poll();
				newList.add(node.val);
				for (Node newnode : node.children) {
					queue.offer(newnode);
				}
			}
			list.add(newList);
		}
		 
		 
		 return list;
	}
	
	
	
	// 递归
	 public List<List<Integer>> levelOrder(Node root) {
		 List<List<Integer>> list = new ArrayList<>();
		 if (root == null) {
			return list;
		}
		 helper(root, 0, list);
		 return list;
	 }
	 
	 private void helper(Node node , int deep, List<List<Integer>> list) {
		 if (node == null) {
			return;
		}
		 if (deep+1 > list.size()) {
			list.add(new ArrayList<>());
		}
		 
		 list.get(deep).add(node.val);
		for (Node newnode : node.children) {
			helper(newnode, deep+1, list);
		}
		 
	 }
	 
}
