package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
public class _662_二叉树最大宽度 {
	 int TheMaxWidth = 0;
	 public int widthOfBinaryTree(TreeNode root) {
	       
	        List<Integer> leftList = new ArrayList<>();
	        
	        MaxWidth(root, 1,1,leftList);
	        return TheMaxWidth;
	    }
	 
	 private void MaxWidth(TreeNode node, int level, int index,List<Integer> leftList) {
		if (node == null) {
			return;
		}
		if (level>=leftList.size()) {
			leftList.add(index);
		}
		
		TheMaxWidth = Math.max(TheMaxWidth,index-leftList.get(level-1)+1 );
		MaxWidth(node.left, level+1, index*2,leftList);
		MaxWidth(node.right, level+1, index*2+1,leftList);
	}
}
