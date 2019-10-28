package YZLeetCode;

//https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves/
public class _1123_最深叶节点的最近公共祖先 {
	TreeNode res = null;
    int max = 0;
	 public TreeNode lcaDeepestLeaves(TreeNode root) {
	        
		 	dfs(root, 0);
	        return res;
	    }
	    
	    int dfs(TreeNode root, int depth) {
	       if (root == null) {
			return depth;
		}
	       
	       int leftDepth = dfs(root.left, depth+1);
	       int rightDepth = dfs(root.right, depth+1);
	    	
	       if (leftDepth == rightDepth && max<=leftDepth) {
			res = root;
			max = leftDepth;
		}
	       return Math.max(leftDepth, rightDepth);
	       
	    }
}
