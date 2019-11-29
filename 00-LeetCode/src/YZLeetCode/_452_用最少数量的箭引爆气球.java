package YZLeetCode;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
public class _452_用最少数量的箭引爆气球 {
	 public int findMinArrowShots(int[][] points) {
	     	int leng = points.length;
	     	if (leng<2) {
				return leng;
			}
	     	
	     	Arrays.sort(points, new Comparator<int[]>() {
	     		@Override
	     		public int compare(int[] o1, int[] o2) {
	     			if (o1[1] != o2[1] ) {
						return o1[1] - o2[1]; 
					}
	     			return 2;
	     		}
			});
	     	
	     	int minCount = 1;
	     	int end = points[0][1];
	     	for (int i = 1; i < leng; i++) {
				if (points[i][0] > end) {
					minCount++;
					end = points[i][1];
				}
			}
	     	return minCount;
	     	
	     	
	     	
	    }
	 public int findMinArrowShots2(int[][] points) {
	     	int leng = points.length;
	     	if (leng<2) {
				return leng;
			}
	     	
	     	Arrays.sort(points, new Comparator<int[]>() {
	     		@Override
	     		public int compare(int[] o1, int[] o2) {
	     			if (o1[0] != o2[0] ) {
						return o1[0] - o2[0]; 
					}
	     			return o1[1] - o2[1];
	     		}
			});
	     	
	     	int minCount = 1;
	     	int end = points[0][1];
	     	for (int i = 1; i < leng; i++) {
				if (points[i][0] <= end) {
					end = Math.min(end, points[i][1]);
				}else {
					minCount++;
					end = points[i][1];
				}
			}
	     	return minCount;
	     	
	     	
	     	
	    }
}
