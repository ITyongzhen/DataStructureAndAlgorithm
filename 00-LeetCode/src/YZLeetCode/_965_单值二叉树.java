package YZLeetCode;

// https://leetcode-cn.com/problems/univalued-binary-tree/
public class _965_单值二叉树 {
	boolean isUnivalBool = true;
	
//	 public boolean isUnivalTree2(TreeNode root) {
//		  if (root == null) {
//				return false;
//			}  
//		      int value = root.val;
//		     
//		 
//	 }
	
	  public boolean isUnivalTree(TreeNode root) {
	      if (root == null) {
			return false;
		}  
	      int value = root.val;
	      isUnival(root, value);
	      return isUnivalBool;
	      
	      
	     
	    }
	  
	  private void isUnival(TreeNode node,int value) {
		if (node == null) {
			return ;
		}
		  if (node.val != value) {
			  isUnivalBool = false;
			  return;
		  }
		  isUnival(node.left, value);
		  isUnival(node.right, value);
		  
	  }
}
