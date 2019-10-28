package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
//给定二叉树 [3,9,20,null,null,15,7],
//
//3
/// \
//9  20
///  \
//15   7
//返回其自底向上的层次遍历为：
//
//[
//[15,7],
//[9,20],
//[3]
//]
public class _107_二叉树的层次遍历II {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		 List<List<Integer>> list = new ArrayList<>();
    
		 DFS(root, 0, list);
		 
        return list;
    }
	
	private void DFS(TreeNode node , int level, List<List<Integer>> list) {
		if (node == null) {
			return ;
		}
		
		// 当前层数还没有元素，new一个列表
		if (list.size()<=level) {
			list.add(0, new ArrayList<>());
		}
		
		// 加入当前元素 
		list.get(list.size() - 1 - level).add(node.val);
		DFS(node.left, level+1, list);
		DFS(node.right, level+1, list);
		
	}
	
}
