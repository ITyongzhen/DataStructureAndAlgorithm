package YZLeetCode;
//https://leetcode-cn.com/problems/min-cost-climbing-stairs/
public class _746_使用最小花费爬楼梯 {
	
	public static void main(String[] args) {
		minCostClimbingStairs(new int[] {});
	}
	
	static public int minCostClimbingStairs(int[] cost) {
	        if (cost == null || cost.length == 0) {
				return 0;
			}
	        
	        if (cost.length == 1) {
				return cost[0];
			}
	        
	        if (cost.length == 2) {
				return cost[1];
			}
	        
	        int dp[] = new int[cost.length];
	        dp[0] = cost[0];
	        dp[1] = cost[1];
	        
	        for (int i = 2; i < dp.length; i++) {
				if (dp[i-1] < dp[i-2]) {
					dp[i] = dp[i-1] + cost[i];
				}else {
					dp[i] = dp[i-2] + cost[i];
				}
				
			}
	        
	        return Math.min( dp[cost.length-1],  dp[cost.length-2]);
	    }
}
