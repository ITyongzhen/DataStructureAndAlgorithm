package YZLeetCode;
//https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//返回如下的二叉树：
//		3
//	   / \
//	  9  20
//      /  \
//     15   7

import java.util.HashMap;

public class _105_从前序与中序遍历序列构造二叉树 {
	public static void main(String[] args) {
		int[] preorder = new int[] {3,9,20,15,7};
		int[] inorder = new int[] {9,3,15,20,7};
		TreeNode rooTreeNode = buildTree2(preorder, inorder);
		System.out.println(rooTreeNode);
	}
	
	static public TreeNode buildTree2(int[] preorder, int[] inorder) {
		 if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0 || preorder.length != inorder.length) {
			return null;
		}
		 return help(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
		 
	 }
	
	static private TreeNode help(int[] preorder,int preStart, int preEnd, int[] inorder,int inStart,int inEnd) {
		 if(preStart > preEnd || inStart>inEnd) {
			 return null;
		 }
		 int cur = preorder[preStart];
		 TreeNode head  = new TreeNode(cur);
		 int index = 0;
		 while (inorder[index + inStart] != cur) {
			 index++;
		}
		 
		 head.left = help(preorder, preStart+1, preStart+index , inorder, inStart, inStart+index);
		 head.right = help(preorder, preStart+index+1, preEnd, inorder, inStart+index+1, inEnd);
		 
		 return head;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int pre_dix = 0;
	int[] preorder;
	int[] inorder;
	HashMap<Integer, Integer> idHashMap;
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	        this.preorder = preorder;
	        this.inorder = inorder;
	        idHashMap = new HashMap<>();
	        for (int i = 0; i < inorder.length; i++) {
				idHashMap.put(inorder[i], i);
				}
	        return helper(0, preorder.length, 0, inorder.length);
		 
	}
	 
	 private TreeNode helper(int p_start,int p_end,int i_start,int i_end) {
		 if (p_start == p_end) {
			return null;
		}
		 
		 
		 int root_val = preorder[p_start];
		 TreeNode root = new TreeNode(root_val);
		 int index = idHashMap.get(root_val);
		 int leftNum = index - i_start;
		 
		 root.left = helper(p_start+1, p_start+leftNum+1, i_start, i_end);
		 root.right = helper(p_start+leftNum+1, p_end, index+1, i_end);
		 return root;
	 }
	 
	 
//	 private TreeNode helper(int left, int right) {
//		 if (left == right) {
//			return null;
//		}
//		 int root_val = preorder[pre_dix];
//		 
//		 TreeNode root = new TreeNode(root_val);
//		 int index = idHashMap.get(root_val);
//		 
//		 pre_dix++;
//		 
//		 root.left = helper(left, index);
//		 root.right = helper(index+1, right);
//		 
//		
//		 return root;
//	}
//	 
	 
}
