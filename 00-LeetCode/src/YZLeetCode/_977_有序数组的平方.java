package YZLeetCode;

import java.util.Arrays;

// https://leetcode-cn.com/problems/squares-of-a-sorted-array/
//输入：[-7,-3,2,3,11]
//输出：[4,9,9,49,121]
public class _977_有序数组的平方 {
	
	
	
	 public int[] sortedSquares2(int[] A) {
	        
		 int len = A.length;
		 int left = 0;
		 int right = len-1;
		 
		 int[] arr = new int[len];
		 int currentIndex = len-1;
		
		 while (left<right) {
			 if (Math.abs(A[left]) >= Math.abs(A[right])) {
				 	arr[currentIndex--] = (int)Math.pow(A[left], 2);
				 	left++;
			 	}else {
			 		arr[currentIndex--] = (int)Math.pow(A[right], 2);
			 		right--;
				}
			
		}
		 
		return arr;
	    }
	 
	 public int[] sortedSquares(int[] A) {
	        
		 int len = A.length;
		 int[] arr = new int[len];
		 for (int i = 0; i < A.length; i++) {
			arr[i] = A[i] * A[i];
		}
		 Arrays.sort(arr);
		 return arr;
	    }
}
