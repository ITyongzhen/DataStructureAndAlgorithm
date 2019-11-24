package YZLeetCode;
//https://leetcode-cn.com/problems/climbing-stairs/
public class _70_爬楼梯 {
	
	public static void main(String[] args) {
		int res = climbStairs(3);
	}
	
	
	static public int climbStairs(int n) {
		// dp[n-1] 表示n阶楼梯的爬法
		if (n==1) {
			return 1;
		}
		if (n==2) {
			return 2;
		}
        int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 2;
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n-1];
		
    }
}
