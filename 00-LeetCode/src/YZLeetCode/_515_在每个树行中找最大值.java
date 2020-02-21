package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/
public class _515_在每个树行中找最大值 {
	public static void main(String[] args) {
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(3);
		TreeNode node3=new TreeNode(2);
		TreeNode node4=new TreeNode(5);
		TreeNode node5=new TreeNode(3);
		TreeNode node6=new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.right = node6;
		List<Integer> resIntegers = largestValues(node1);
		System.out.println(resIntegers);
		
	}
	
	static public List<Integer> largestValues(TreeNode root) {
		 List<Integer> resIntegers = new ArrayList<>();
		 if (root == null) {
			return resIntegers;
		}
		 
//		 TreeNode node = root;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int max = Integer.MIN_VALUE;
		int levelNum = 1;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			max=Math.max(max, node.val);
			levelNum--;
			
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
			System.out.println("levelnum =" + levelNum );
			System.out.println("max =" + max );
			if (levelNum == 0) {
				//这一行结束
				resIntegers.add(max);
				System.out.println("添加  max =" + max );
				max = Integer.MIN_VALUE;
				levelNum = queue.size();
				System.out.println("添加之后 levelnum =" + levelNum );
				
			}
		}
		 
		 
		 return resIntegers;
	    }
}
