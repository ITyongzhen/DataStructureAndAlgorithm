package YZLeetCode;
//https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class _106_从中序与后序遍历序列构造二叉树 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }
        return help(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);

    }

    private TreeNode help(int[] inorder, int inStart, int inEnd, int[] postorder, int posStart, int posEnd) {
        //递归终止条件
        if (inStart > inEnd || posStart > posEnd) {
            return null;
        }
        //后续遍历的最后一个节点就是根节点
        TreeNode head = new TreeNode(postorder[posEnd]);
        int index = 0;
        while (inorder[inStart+index] != postorder[posEnd]) {
            index++;
        }
        head.left = help(inorder, inStart, inStart + index - 1, postorder, posStart, posStart + index - 1);
        head.right = help(inorder, inStart + index + 1, inEnd, postorder, posStart + index, posEnd - 1);
        return head;
    }

    
}
