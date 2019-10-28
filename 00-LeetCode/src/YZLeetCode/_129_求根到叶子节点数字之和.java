package YZLeetCode;

//https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
public class _129_求根到叶子节点数字之和 {
		int sum;
	 public int sumNumbers(TreeNode root) {
	        sum = 0;
	        if (root == null) {
				return 0;
			}
	        
	        dfs(root,0);
	        return sum;
	    }
	 
	 
	 private void dfs(TreeNode node,int num) {
		 num = num *10 + node.val;
		 if (node.left == null && node.right == null) {
			sum+=num;
			return;
		}
		
		 if (node.left != null) {
			 dfs(node.left, num);
		}
		 
		 if (node.right != null) {
			 dfs(node.right, num);
		}
		 return;
	 }
}
