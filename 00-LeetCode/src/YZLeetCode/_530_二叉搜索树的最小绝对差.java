package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

// https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
public class _530_二叉搜索树的最小绝对差 {
	TreeNode pre = null;
	int res = Integer.MAX_VALUE;
	
	public int getMinimumDifference(TreeNode root) {
	    if (root == null) return 0;
	    helper(root);
	    return res;
	}

	private void helper(TreeNode root) {
	    if (root == null) return;
	    helper(root.left);
	    if (pre != null) {
	        //求相邻节点的差值
	        res = Math.min(res, Math.abs(root.val - pre.val));
	    }
	    pre = root;
	    helper(root.right);
	}


	 public int getMinimumDifference2(TreeNode root) {
	        if(root == null)return 0;
	       ArrayList<Integer> arr = new ArrayList<>();
	      
	       	int cha = Integer.MAX_VALUE;
	       
	        for(int i = 1;i<arr.size();i++){
	        	
	        	int k =Math.abs(arr.get(i) - arr.get(i-1));
	            if (k==1) {
					cha = 1;
					break;
				}else if(k<cha){
					cha = k;
				}
	        };
	        
	        return cha;
	    }
}
