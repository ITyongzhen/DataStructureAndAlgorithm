package YZLeetCode;

public class _437_路径综合III {
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(-3);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(11);
		TreeNode node7 = new TreeNode(3);
		TreeNode node8 = new TreeNode(-2);
		TreeNode node9 = new TreeNode(1);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node4.left = node7;
		node4.right = node8;
		node5.right = node9;
		node3.right = node6;
		
		int a = paths(node1, 8);
		System.out.println(a);
	}
	
	static public int pathSum(TreeNode root, int sum) {

	        if (root == null) {
	            return 0;
	        }

	        return paths(root, sum) 
	                + pathSum(root.left, sum) 
	                + pathSum(root.right, sum);
	    }

	   static private int paths(TreeNode root, int sum) {
		  
	        if (root == null) {
	            return 0;
	        }
	        System.out.println("before root.vat = "+root.val+" sum = "+sum  );
	        int res = 0;
	        if (root.val == sum) {
	            res += 1; 
	            System.out.println("add root.vat = "+root.val+" sum = "+sum +"res = "+res );
	        }
	        
	        res += paths(root.left, sum - root.val);
	        res += paths(root.right, sum - root.val);
	        
	        return res;
	    }

}
