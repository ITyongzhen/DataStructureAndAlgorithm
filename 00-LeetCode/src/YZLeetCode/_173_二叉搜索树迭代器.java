package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode-cn.com/problems/binary-search-tree-iterator/
public class _173_二叉搜索树迭代器 {
	Queue<Integer> queue = new LinkedList<>();;
	    public _173_二叉搜索树迭代器(TreeNode root) {
//	        queue =  new LinkedList<>();
//	        period(root);
	    }
	    
	    private void period(TreeNode node){
	        if(node == null)return;
	        if(node.left != null)period(node.left);
	        queue.add(node.val);
	        if(node.right != null)period(node.right);
	    }
	    
	    
	    
	    /** @return the next smallest number */
	    public int next() {
	        return queue.poll();
	    }
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !queue.isEmpty();
	    }
}
