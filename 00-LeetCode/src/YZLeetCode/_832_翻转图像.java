package YZLeetCode;

import java.sql.Array;

// https://leetcode-cn.com/problems/flipping-an-image/
public class _832_翻转图像 {
	 public int[][] flipAndInvertImage(int[][] A) {
	        for (int i = 0; i < A.length; i++) {
				int[] arr = recoverImage(recover(A[i]));
				A[i] = arr;
			}
		 
	        return A;
	    }
	 
	 private int[] recoverImage(int[] Arr) {
		 int len = Arr.length;
		 for (int i = 0; i < len/2; i++) {
				int temp = Arr[i];
				Arr[i] = Arr[len-1-i];
				Arr[len-1-i] = temp;
			}
		 return Arr;
	 }
	 
	 private int[] recover(int[] Arr) {
		 int len = Arr.length;
		 for (int i = 0; i < len; i++) {
			if (Arr[i] == 1) {
				Arr[i] = 0;
			}else {
				Arr[i] = 1;
			}
		}
		 
		 return Arr;
	 }
}
