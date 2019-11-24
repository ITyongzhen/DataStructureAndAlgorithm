package YZLeetCode;
//https://leetcode-cn.com/problems/house-robber/
public class _198_打家劫舍 {
	
	public static void main(String[] args) {
		rob(new int[]{1,3,1});
	}
	
	static public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) {
			return 0;
		}
        
        int pre2 = nums[0];
        int pre1 = 0;
      
        if (nums.length >= 2) {
        	pre1 = Math.max(nums[0], nums[1]);
		}
        int max = Math.max(pre1, pre2);
        
        for (int i = 2; i < nums.length; i++) {
        	if (pre2 + nums[i] > pre1) {
				max = pre2 + nums[i];
				
				pre2 = pre1;
				pre1 = max;
			}else {
				max = pre1;
				pre2 = pre1;
			}
        }
        return max;
    }
	
	static public int rob2(int[] nums) {
	        if (nums.length == 0 || nums == null) {
				return 0;
			}
	        
	        int dp[] = new int[nums.length];
	        dp[0] = nums[0];
	        
	        if (nums.length >= 2) {
				dp[1] = Math.max(nums[0], nums[1]);
			}
	        
	        for (int i = 2; i < dp.length; i++) {
	        	if (dp[i-2] + nums[i]>dp[i-1]) {
					dp[i] = dp[i-2] + nums[i];
				}else {
					dp[i] =dp[i-1];
				}
	        }
	        return dp[nums.length-1];
	    }
}
