package YZLeetCode;

public class _111_二叉树的最小深度 {
	  public int minDepth(TreeNode root) {
		  if (root == null) {
			return 0;
		}
		return  bfs(root);
	    }
	  
	  private int  bfs(TreeNode node) {
		if (node == null) {
			return 0;
		}
		  
		  if ((node.left == null && node.right == null)) {
				 return 1;
			  }
		  
		  int minDepth = Integer.MAX_VALUE;
		  
		 
		  
		  if (node.left!=null) {
			  minDepth =  Math.min(bfs(node.left), minDepth);
					  
		  }
		 
		  if (node.right!=null) {
			  minDepth =  Math.min(bfs(node.right), minDepth);
		  }
		  
		  return minDepth + 1 ;
	}
}
