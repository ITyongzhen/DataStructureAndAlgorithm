package YZLeetCode;
// https://leetcode-cn.com/problems/transpose-matrix/

//输入：[[1,2,3],[4,5,6],[7,8,9]]
//输出：[[1,4,7],[2,5,8],[3,6,9]]
//		
//输入：[[1,2,3],[4,5,6]]
//输出：[[1,4],[2,5],[3,6]]

public class _867_转置矩阵 {

	public int[][] transpose(int[][] A) {
		if (A.length == 0) {
			return null;
		}
		int[] a = A[0];
		int[][] arr = new int[a.length][A.length];
		
        for (int i = 0; i < A.length; i++) {
        	int[] arr1 = A[i];
			for (int j = 0; j < arr1.length; j++) {
				arr[j][i] = arr1[j]; 
			}
		}
		return arr;
    }
}
