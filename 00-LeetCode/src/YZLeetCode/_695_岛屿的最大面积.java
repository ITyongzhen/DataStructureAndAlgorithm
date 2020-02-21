package YZLeetCode;
//https://leetcode-cn.com/problems/max-area-of-island/
public class _695_岛屿的最大面积 {
	public int maxAreaOfIsland(int[][] grid) {
        
		if (grid.length == 0) {
			return 0;
		}
		
		int max = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					int num =check(grid, i, j);
					max = Math.max(max, num);
				}
			}
		}
		
		
		return max;
    }
	
	
	private int check(int[][] grid,int x,int y) {
		int count = 1;
		grid[x][y] = 0;
		if (x-1 >=0 && grid[x-1][y] == 1) {
			count += check(grid, x-1, y);
		}
		
		if (x+1 <grid.length && grid[x+1][y] == 1) {
			count += check(grid, x+1, y);
		}
		
		if (y-1 >= 0 && grid[x][y-1] == 1) {
			count += check(grid, x, y-1);
		}
		
		if (y+1 <grid[0].length && grid[x][y+1] == 1) {
			count += check(grid, x, y+1);
		}
		return count;
	}
	
	
	
	
}
