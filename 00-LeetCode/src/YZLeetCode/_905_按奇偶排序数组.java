package YZLeetCode;

import java.util.Iterator;
import java.util.Stack;

// https://leetcode-cn.com/problems/sort-array-by-parity/
public class _905_按奇偶排序数组 {
	public int[] sortArrayByParity(int[] A) {
		int len = A.length;
        int[] arr = new int[len];
        
        int i = 0;
        int right = len - 1;
        for (int k : A) {
			if ((k & 1)==0) {
				arr[i++] = k;
			}else {
				arr[right--] = k;
			}
		}
        
        return arr;
    }
}
