package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/path-sum-ii/
public class _113_路径总和II {
	
	public static void main(String[] args) {
		TreeNode rootNode= new TreeNode(5);
		TreeNode Node1= new TreeNode(4);
		TreeNode Node2= new TreeNode(8);
		TreeNode Node3= new TreeNode(11);
		TreeNode Node4= new TreeNode(13);
		TreeNode Node5= new TreeNode(4);
		TreeNode Node6= new TreeNode(7);
		TreeNode Node7= new TreeNode(2);
		TreeNode Node8= new TreeNode(5);
		TreeNode Node9= new TreeNode(1);
		
		rootNode.left = Node1;
		rootNode.right = Node2;
		Node1.left = Node3;
		Node2.left = Node4;
		Node2.right = Node5;
		Node3.left = Node6;
		Node3.right = Node7;
		Node5.left = Node8;
		Node5.right = Node9;
		List<List<Integer>>  resList = pathSum(rootNode, 22);
		System.out.println(resList);
		
		
	}
	//[7,0,null,-1,-6,null,1,null,null,-7]
	//	0
	static List<List<Integer>> res;
	static public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        
		  res = new ArrayList<>();
//		 if (sum == 0 || root == null) {
//			 return res;
//		}

		getNumWithNode(root, sum,new ArrayList<>());
		 
		 
		 return res;
		
	    }
	 
	 
	static void getNumWithNode(TreeNode node,int sum,List<Integer> list) {
	
		 if (node == null) {
			return ;
		}
		 sum -= node.val;
		 list.add(node.val);
		
		if (node.left == null && node.right == null) {
			if (sum == 0) {
				res.add(new ArrayList<>(list));
			}
		}
		
		if (node.left!=null) {
//			list.add(node.left.val);
			 getNumWithNode(node.left, sum,list);
		}
		
		if (node.right!=null) {
			getNumWithNode(node.right, sum, list);
		}
		
		list.remove(list.size() -1);
	}
}
