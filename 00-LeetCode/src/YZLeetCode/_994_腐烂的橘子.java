package YZLeetCode;
//https://leetcode-cn.com/problems/rotting-oranges/
public class _994_腐烂的橘子 {
	 public int orangesRotting(int[][] grid) {
		 
		return dfs(grid, 0);
		
	    }
	 
	 private int dfs(int[][] grid ,int days) {
		
		 
		 
		return dfs(grid, days+1);
		 
	}
}
