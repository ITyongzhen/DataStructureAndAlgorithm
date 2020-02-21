package YZLeetCode;

public class _559_N叉树的最大深度 {
	static int theMaxDepth = 0;
	 public int maxDepth(Node root) {
	        if (root == null) {
				return 0;
			}
	     int max = 0;
	     for (int i = 0; i < root.children.size(); i++) {
			max = Math.max(max, maxDepth(root.children.get(i)));
		}
		 return max+1;
		 
	    }
	
}
