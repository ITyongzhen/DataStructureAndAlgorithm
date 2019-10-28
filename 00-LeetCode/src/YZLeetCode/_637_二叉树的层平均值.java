package YZLeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
public class _637_二叉树的层平均值 {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
	
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			double sum = 0;
			int num = queue.size();
			int k = num;
			while (k-- >0) {
				TreeNode newNode = queue.poll();
				sum = sum + newNode.val;
				if (newNode.left != null) {
					queue.offer(newNode.left);
				}
				if (newNode.right != null) {
					queue.offer(newNode.right);
				}
			}
			res.add(sum/num);
		}
		
		
		
		return res;
    }
	
    public List averageOfLevels2(TreeNode root) {
        List ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            int num = count;
            double total = 0;
            while (count-- > 0) {
                TreeNode node = (TreeNode) queue.poll();

                if (node == null) {
                    continue;
                }

                total += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            ans.add(total / num);
        }

        return ans;
    }

}
