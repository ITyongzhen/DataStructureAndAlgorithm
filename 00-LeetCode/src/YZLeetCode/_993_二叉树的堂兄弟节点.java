package YZLeetCode;

import java.util.HashMap;
import java.util.Map;

public class _993_二叉树的堂兄弟节点 {
	
//	 Map<Integer, Integer> depth;
//	    Map<Integer, TreeNode> parent;
//
//	    public boolean isCousins(TreeNode root, int x, int y) {
//	        depth = new HashMap();
//	        parent = new HashMap();
//	        dfs(root, null);
//	        return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
//	    }
//
//	    public void dfs(TreeNode node, TreeNode par) {
//	        if (node != null) {
//	            depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
//	            parent.put(node.val, par);
//	            dfs(node.left, node);
//	            dfs(node.right, node);
//	        }
//	    }


	Map<Integer, Integer> depth;
	Map<Integer, TreeNode> parent;
	
	 public boolean isCousins(TreeNode root, int x, int y) {
		 depth = new HashMap<>();
		 parent = new HashMap<>();
		 dfs(root, null);
		 return (depth.get(x) == depth.get(y) && (parent.get(x)!= parent.get(y)));
		 
	 }
	
	private void dfs(TreeNode node, TreeNode par) {
		if (node != null) {
			depth.put(node.val, par != null?  1+ depth.get(par.val):0 );
			parent.put(node.val, par);
			dfs(node.left, node);
			dfs(node.right, par);
		}
		
	}
	
	
	
	
//	
//	int node1father = -1;
//	int node2father = -1;
//	boolean node1stop = false;
//	boolean node2stop = false;
//	int deptnode1 = 0;
//	int deptnode2 = 0;
//	 public boolean isCousins(TreeNode root, int x, int y) {
//	     
//		 isTheCousins(root, x, y,0);
//		 return ((node1father != node2father) && (deptnode1 == deptnode2));
//	    }
//	 
//	 private void isTheCousins(TreeNode node, int x, int y,int deep) {
//		 if (node.val == x) {
//			node1stop = true;
//		 }
//		 if (node.val == y) {
//			node2stop = true;
//		 }
//		 
//		 node1father = (node1stop == false ? node.val:node1father); 
//		 node2father = (node2stop == false ? node.val:node2father); 
//		 deptnode1 = (node1stop == false ? deep : deptnode1);
//		 deptnode2 = (node2stop == false ? deep : deptnode2);
//		 if (node.left!= null) {
//			isTheCousins(node.left, x, y,deep+1);
//			
//		 }
//		 
//		 if (node.right!= null) {
//				isTheCousins(node.right, x, y,deep+1);
//				
//		}
//		 return ;
//	 }
}
