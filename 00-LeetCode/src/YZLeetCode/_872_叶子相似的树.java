package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/leaf-similar-trees/
public class _872_叶子相似的树 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList();
         List<Integer> list2 = new ArrayList();
        
        sortB(root1,list1);
        sortB(root2,list2);
        
        if(list1.size() != list2.size())return false;
        boolean res = true;
        for(int i = 0;i<list1.size();i++){
            if(list1.get(i) != list2.get(i)){
                res = false;
                break;
            }
        }
        return res;
        
    }
    
    private void sortB(TreeNode node,List<Integer> list){
        if(node == null)return;
        sortB(node.left,list);
        if(node.left == null && node.right == null){
            list.add(node.val);
        }
        sortB(node.right,list);
    }
}
