package YZLeetCode;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
public class _589_N叉树的前序遍历 {
	
	public static void main(String[] args) {
		Node node = new Node(2,null);
		 List<Integer> resIntegers = preorder(node);
	}
	
	static public List<Integer> preorder(Node root) {
		 List<Integer> resInteger = new ArrayList<>();
		 Stack<Node> stack = new Stack<>();
		 if (root == null) {
			return resInteger;
		}
		 stack.push(root);
		 while (!stack.isEmpty()) {
			 Node curNode = stack.pop();
			 
			 resInteger.add(curNode.val);
			 if (curNode.children != null) {
				 for (int i = curNode.children.size() -1; i >=0; i--) {
						stack.push(curNode.children.get(i));
					}
			}
			
			
		}
		 
		 
		 return resInteger;
	    }
}
