package YZLeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//https://leetcode-cn.com/problems/two-city-scheduling/
public class _1029_两地调度 {
	 public int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				return (o1[0] - o1[1]) - (o2[0] - o2[1]);
			}
		});
		
		
		int sum = 0;
		int n = costs.length/2;
		for (int i = 0; i < n; i++) {
			sum+=costs[i][0] + costs[i+n][1];
		}
		return sum;
		
	 }
	   
}
