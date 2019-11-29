package YZLeetCode;
//https://leetcode-cn.com/problems/car-pooling/submissions/

import javax.print.attribute.standard.RequestingUserName;

public class _1094_拼车 {
	
	public static void main(String[] args) {
		boolean res = carPooling(new int[][]{{2,1,5},{3,3,7}},4);
	}
	
	static public boolean carPooling(int[][] trips, int capacity) {
		 int[] res = new int[1001];
		 for (int[] i : trips) {
			res[i[1]] += i[0];
			res[i[2]] -= i[0];
		}
		 
		 if (res[0] > capacity) {
			return false;
		}
		 
		 for (int i = 1; i < res.length; i++) {
			res[i] += res[i-1];
			 if (res[i] > capacity) {
					return false;
				}
			}
		 return true;
		 }
	
	 
}
