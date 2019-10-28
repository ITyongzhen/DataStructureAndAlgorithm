package YZLeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class _404_左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)return 0;
        int res = 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
         TreeNode newnode = queue.poll();
         if (newnode.left != null) {
        	 if (newnode.left == null && newnode.right == null) {
        		 res += newnode.left.val;
        	 	}
        	queue.offer(newnode.left);
         	}
         
         if (newnode.right != null) {
        	
        	 queue.offer(newnode.right);
         	}
        }
        return res;
    }
    
}
