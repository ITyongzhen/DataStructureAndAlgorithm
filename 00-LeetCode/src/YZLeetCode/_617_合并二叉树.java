package YZLeetCode;

// https://leetcode-cn.com/problems/merge-two-binary-trees/
public class _617_合并二叉树 {
	
	   public TreeNode mergeTrees4(TreeNode t1, TreeNode t2) {
		     //当存在空树时递归终止
		        if(t1 == null) return t2;
		        if(t2 == null) return t1;

		        //将t1作为基准进行合并
		        t1.val = t2.val+t1.val;
		        t1.left = mergeTrees4(t1.left,t2.left);
		        t1.right = mergeTrees4(t1.right,t2.right);
		        return t1;

		    }

	 	public TreeNode mergeTrees2(TreeNode t1, TreeNode t2,TreeNode newNode) {
		 if (t1==null ) {
			return t2;
		 }
		 if (t2==null ) {
				return t1;
		}
		 
		 mergeTrees2(t1.left, t2.left, newNode);
		 newNode.val += t2==null?0:t2.val;
		 mergeTrees2(t1.right, t2.right, newNode);
		 return newNode;
	 }
	 
}
