package YZLeetCode;
//https://leetcode-cn.com/problems/smallest-range-i/
public class _908_最小差值I {
	 public int smallestRangeI(int[] A, int K) {
		 int length = A.length;
		
	     int min = A[0];   
		 int max = A[0];
		 
		 for (int i = 0; i < length; i++) {
			min = Math.min(min, A[i]);
			max = Math.max(max, A[i]);
		}
		 
		int cha = max - min - 2*K;
		return cha>0?cha:0;
		 
	    }
}
