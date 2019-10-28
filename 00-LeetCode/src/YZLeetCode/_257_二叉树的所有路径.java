package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/binary-tree-paths/
public class _257_二叉树的所有路径 {
   

public List<String> binaryTreePaths2(TreeNode root) {
    List<String> list = new ArrayList<>();
    
     getPath2(root,"",list);
    return list;
}

private void getPath2(TreeNode node,String path,List<String> list){
    if(node == null) return;
    
    if(path.length()>0){
    	path+="->";
    }
    path += (String.valueOf(node.val));
    if(node.left == null && node.right == null){
       
       list.add(path);
    }
    
    if(node.left != null){
        getPath2(node.left,path,list);
    }
    
    if(node.right != null){
        getPath2(node.right,path,list);
    }
}
}
