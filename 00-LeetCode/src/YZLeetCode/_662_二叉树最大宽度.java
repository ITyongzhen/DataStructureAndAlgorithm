package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
public class _662_二叉树最大宽度 {
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(3);
		TreeNode node6 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.right = node6;
		int a = widthOfBinaryTree(node1);
		System.out.println(a);
	}
	
	
	static int TheMaxWidth = 0;
	static public int widthOfBinaryTree(TreeNode root) {
	       
	        List<Integer> leftList = new ArrayList<>();
	        
	        MaxWidth(root, 1,1,leftList);
	        return TheMaxWidth;
	    }
	 
	static private void MaxWidth(TreeNode node, int level, int index,List<Integer> leftList) {
		if (node == null) {
			return;
		}
		if (level>=leftList.size()) {
			leftList.add(index);
		}
		System.out.println("  TheMaxWidth ="+ TheMaxWidth + "  level = " +level +"  index = " + index );
		TheMaxWidth = Math.max(TheMaxWidth,index-leftList.get(level-1)+1 );
		MaxWidth(node.left, level+1, index*2,leftList);
		MaxWidth(node.right, level+1, index*2+1,leftList);
	}
}
