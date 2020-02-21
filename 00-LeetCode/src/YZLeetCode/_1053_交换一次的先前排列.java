package YZLeetCode;

import java.awt.image.RescaleOp;

//https://leetcode-cn.com/problems/previous-permutation-with-one-swap/solution/han-xiang-xi-fen-xi-si-lu-jian-dan-ti-mu-you-qu-by/
public class _1053_交换一次的先前排列 {
	public static void main(String[] args) {
		int[] res = prevPermOpt1(new int[] {1,9,4,6,7});
	}
	
	static public int[] prevPermOpt1(int[] A) {
		 int length = A.length;
		 int curmax = -1;
		 int index = -1;
		 boolean hasRes = false;
		 for (int i = length-2; i >=0; i--) {
			if (A[i+1] < A[i]) {
				
				for (int j = i+1; j < length; j++) {
					if (A[i] > A[j]) {
						hasRes = true;
						if (A[j] > curmax) {
							curmax = A[j];
							index = j;
						}
					}
				}
				
				if (hasRes) {
					int temp = A[i];
					A[i] = A[index];
					A[index] = temp;
					return A;
				}
				
				
			}
		}
		 
		 return A;
	 }
}
