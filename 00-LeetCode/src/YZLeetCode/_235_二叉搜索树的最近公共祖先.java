package YZLeetCode;

// https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class _235_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val>root.val && q.val>root.val){
            // 左右都大于根节点，说明在右子树
           return lowestCommonAncestor(root.right,p,q);
        }else if(p.val<root.val && q.val<root.val){
            // 左右都小于于根节点，说明在左子树
           return lowestCommonAncestor(root.left,p,q);
        }else{
           return root;  
        }
                
    }
}
