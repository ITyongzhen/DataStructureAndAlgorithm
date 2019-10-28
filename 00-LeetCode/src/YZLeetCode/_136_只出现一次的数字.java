package YZLeetCode;
//https://leetcode-cn.com/problems/single-number/
public class _136_只出现一次的数字 {
	 public int singleNumber(int[] nums) {
	        int a = 0;
	        for(int i = 0;i<nums.length;i++){
	            a = a^nums[i];
	            
	        }
	        return a;
	    }
}
