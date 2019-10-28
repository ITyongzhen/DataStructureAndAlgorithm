package YZLeetCode;
//  https://leetcode-cn.com/problems/sort-array-by-parity-ii/
//输入：[4,2,5,7]
//输出：[4,5,2,7]
//解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
public class _922_按奇偶排序数组II {
	 public int[] sortArrayByParityII(int[] A) {
	      int len = A.length;
		 int[] newArr = new int[len];
		 int ji = 1;
		 int ou = 0;
		 for (int i = 0; i < A.length; i++) {
			int k = A[i];
			if (k % 2 == 0) {
				// 偶数
				newArr[ou] = k;
				ou+=2;
			}else {
				newArr[ji] = k;
				ji+=2;
			}
		}
		 
		 return newArr;
	    }
}
