package YZLeetCode;

//https://leetcode-cn.com/problems/find-bottom-left-tree-value/
public class _513_找树左下角的值 {
	
	int  MaxDepth;
	int res;
	 public int findBottomLeftValue(TreeNode root) {
	         res = -1;
	        MaxDepth = 0;
		 
		 inorder(root, 1);
		 return res;
	    }
	 
	 private void inorder(TreeNode node,int depth) {
		 if (node == null) {
			return;
		}
		 if (depth>MaxDepth) {
			 MaxDepth = depth;
			res = node.val;
		}
		 inorder(node.left, depth+1);
		 inorder(node.right, depth+1);
	 }
}
