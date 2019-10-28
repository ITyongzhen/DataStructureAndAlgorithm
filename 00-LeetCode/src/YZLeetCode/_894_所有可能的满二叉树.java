package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/all-possible-full-binary-trees/solution/java3ms100-by-zxyankh/
public class _894_所有可能的满二叉树 {
	
	 public List<TreeNode> allPossibleFBT(int N) {
	      List<TreeNode> ans = new ArrayList<>();
	        if (N % 2 == 0) {
	            return ans;
	        }
	        if (N == 1) {
	            TreeNode head = new TreeNode(0);
	            ans.add(head);
	            return ans;
	        }
	        for (int i = 1; i < N; i += 2) {
	            List<TreeNode> left = allPossibleFBT(i);
	            List<TreeNode> right = allPossibleFBT(N - 1 - i);
	            for (TreeNode l : left) {
	                for (TreeNode r : right) {
	                    TreeNode head = new TreeNode(0);
	                    head.left = l;
	                    head.right = r;
	                    ans.add(head);
	                }
	            }
	        }
	        return ans;
	    }

}
