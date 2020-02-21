package YZLeetCode;

public class _977_有序数组的评分 {
	public static void main(String[] args) {
		int[] res = sortedSquares(new int[] {-7,-3,2,3,11});
	}
	
	
	static public int[] sortedSquares(int[] A) {
		 int length = A.length;
	     int[] res = new int[length];    
		 int left = 0;
		 int right = length-1;
		 
		 int cur = right;
		 while (left<right) {
			if (Math.abs(A[left]) < Math.abs(A[right])) {
				res[cur] =  (int)Math.pow(A[right], 2);
				right--;
			}else {
				res[cur] =  (int)Math.pow(A[left], 2);
				left++;
			}
			cur--;
		}
	     
	     
	     return res;
	    }
}
