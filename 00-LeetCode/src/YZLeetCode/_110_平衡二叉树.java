package YZLeetCode;
//https://leetcode-cn.com/problems/balanced-binary-tree/


public class _110_平衡二叉树 {
	
	 public boolean isBalanced(TreeNode root) {
		 return depth(root) != -1;
	 }
	
	 private int depth(TreeNode root) {
		 if (root == null)return 0;
		 int left = depth(root.left);
		 if (left == -1)return -1;
		 int right = depth(root.right);
		 if (right == -1)return -1;
		 return Math.abs(left - right) <2 ? Math.max(left, right) +1 :-1;
	 }
	
	
//		boolean res;
//		HashMap<TreeNode, Integer> myHashMap;
//		
//	 public boolean isBalanced(TreeNode root) {
//		 myHashMap = new HashMap<>();
//	       res = true;
//	      
//	       
//		 if (root == null) {
//			return true;
//		 	}
//		 
//		 dfs(root);		
//		 return res;
//	    }
//	 
//	 
//	 
//	 private void dfs(TreeNode node) {
//		 
//		if (node == null) {
//			return ;
//		}
//		
//		if (node.left != null) {
//			 dfs(node.left);
//		
//		}
//		if (node.right != null) {
//			 dfs(node.right);
//		}
//		  if (Math.abs(getDept(node.left) - getDept(node.right))>1) {
//			res = false;
//		  } 
//		 
//	 }
//	 
//	 private int getDept(TreeNode node) {
//		 
//		 if (myHashMap.containsKey(node)) {
//			return myHashMap.get(node);
//		}
//		 
//		 if (node == null) {
//			 myHashMap.put(node, 0);
//			return 0;
//		}
//		 
//		int res = Math.max(getDept(node.left), getDept(node.right)) + 1;
//		myHashMap.put(node, res);
//		return res;
//	 }
	
//		boolean res;
//	 public boolean isBalanced(TreeNode root) {
//	       res = true;
//	      
//		 if (root == null) {
//			return true;
//		 	}
//		 
//		 dfs(root);		
//		 return res;
//	    }
//	 
//	 
//	 
//	 private void dfs(TreeNode node) {
//		 
//		if (node == null) {
//			return ;
//		}
//		
//		if (node.left != null) {
//			 dfs(node.left);
//		
//		}
//		if (node.right != null) {
//			 dfs(node.right);
//		}
//		  if (Math.abs(getDept(node.left) - getDept(node.right))>1) {
//			res = false;
//		  } 
//		 
//	 }
//	 
//	 private int getDept(TreeNode node) {
//		 if (node == null) {
//			return 0;
//		}
//		return Math.max(getDept(node.left), getDept(node.right)) + 1;
//	 }
}
