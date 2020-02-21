package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
public class _590_N叉树的后续遍历 {
	 public List<Integer> postorder(Node root) {
		 List<Integer> res = new ArrayList<>();
		 bfs(root, res);
		 
	     return res;
	    }
	 
	 private void bfs(Node node,List<Integer> res) {
		if (node == null) {
			return;
		}
		
		if (node.children.size()>0) {
			for (int i = 0; i < node.children.size(); i++) {
				bfs(node.children.get(i), res);
			}
		}
		res.add(node.val);
		
	}
}
