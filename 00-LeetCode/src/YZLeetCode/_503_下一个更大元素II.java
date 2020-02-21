package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/next-greater-element-ii/solution/xia-yi-ge-geng-da-yuan-su-ii-by-leetcode/
public class _503_下一个更大元素II {
	public static void main(String[] args) {
		int[] res = nextGreaterElements(new int[] {1,2,1});
		
	}
	
	static public int[] nextGreaterElements(int[] nums) {
         int[] res = new int[nums.length];
		 Stack<Integer> stack = new Stack<>();
		
		
		 for (int i = 2*nums.length-1; i >=0; --i) {

			while (!stack.isEmpty() && nums[stack.peek()] <= nums[i%nums.length]) {
				stack.pop();
			}
			
			res[i%nums.length] = stack.empty()?-1:nums[stack.peek()];
			 stack.push(i%nums.length);
		 }
		 
		 
		 return res;
	    }
}
