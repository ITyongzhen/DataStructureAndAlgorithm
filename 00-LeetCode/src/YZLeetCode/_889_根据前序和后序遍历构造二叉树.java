package YZLeetCode;
//https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/
public class _889_根据前序和后序遍历构造二叉树 {
		 
		 public static void main(String[] args) {
			int[] pre = new int[] {1,2,4,5,3,6,7};
			int[] post = new int[] {4,5,2,6,7,3,1};
			TreeNode resNode = constructFromPrePost(pre, post);
		}
		 
		static int preIndex = 0, posIndex = 0;
		static public TreeNode constructFromPrePost(int[] pre, int[] post) {
		     TreeNode root = new TreeNode(pre[preIndex++]);
		     if (root.val != post[posIndex])
		         root.left = constructFromPrePost(pre, post);
		     if (root.val != post[posIndex])
		         root.right = constructFromPrePost(pre, post);
		     posIndex++;
		     return root;
		 }

		
}
