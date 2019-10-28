package YZLeetCode;

import java.util.ArrayList;
import java.util.List;


//https://leetcode-cn.com/problems/increasing-order-search-tree/
public class _897_递增顺序查找树 {
	public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
			return root;
		}
        
        List<Integer> vals = new ArrayList();
        
        BST(root, vals);
        TreeNode res = new TreeNode(0);
        TreeNode cur= res;
        for (int value : vals) {
			cur.right = new TreeNode(value);
			cur = cur.right;
		}
        
        return res.right;
    }
	
	private void BST(TreeNode node, List<Integer> vals) {
		if(node == null) {
			return ;
		}
		
		
		BST(node.left,vals);
		vals.add(node.val);
		
		BST(node.right,vals);
		
			
	}
}
