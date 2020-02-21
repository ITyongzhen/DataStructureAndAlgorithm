package YZLeetCode;
//https://leetcode-cn.com/problems/wiggle-subsequence/
public class _376_摆动序列 {
	
	 public int wiggleMaxLength(int[] nums) {
		  if (nums.length<2) {
				return nums.length;
			}
		  
		 int prediff = nums[1] - nums[0];
		 int count = prediff!=0?2:1;
		 for (int i = 2; i < nums.length; i++) {
			int diff = nums[i] - nums[i-1];
			if (diff>0 && prediff<=0 || diff<0 && prediff >= 0) {
				count++;
				prediff = diff;
				
			}
		}
		 return count;
	 }
	
	
	 public int wiggleMaxLength2(int[] nums) {
	       if (nums.length<2) {
			return nums.length;
		}
	       
	       int down = 1; 
	       int up = 1;
	       for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i-1]) { 
				up = down+1;
			}else if (nums[i]<nums[i-1]) {
				down = up+1; 
			}
		}
		 
		 
		 return Math.max(down, up);
	    }
}
