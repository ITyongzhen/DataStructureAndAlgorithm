package YZLeetCode;

//https://leetcode-cn.com/problems/convert-bst-to-greater-tree/submissions/
public class _538_把二叉搜索树转换为累加树 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return root;
        TreeNode temp = root;
        
        BSTNode(temp);
        return  temp;
        
    }
    
    private void BSTNode(TreeNode node){
        if(node == null) return;
        
        
        
         if(node.right != null){
            BSTNode(node.right);
         }
        
        //if(node.right == null && node.left == null){
            node.val += sum;
            sum = node.val;
        //}
        // node.val += sum;
        
        if(node.left != null){
            BSTNode(node.left);
        }
       
        
        
    }
}
