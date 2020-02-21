package YZLeetCode;
//https://leetcode-cn.com/problems/minimum-domino-rotations-for-equal-row/
public class _1007_行相等的最少多米诺旋转 {
	 public int minDominoRotations(int[] A, int[] B) {
	        
		 int comNum = A[0];
		 int length = A.length;
		 int tempcomNum = B[0];
		 for (int i = 1; i < length; i++) {
			if (comNum == tempcomNum) {
				break;
			}else {
				if (comNum != A[i] && comNum != B[i]) {
					comNum = tempcomNum;
					break;
				}else if (comNum != A[i] && comNum != B[i]) {
					break;
				}
			}
		 }
		 
		 int sum1 = 0;
		 int sum2 = 0;
		 for (int i = 0; i < B.length; i++) {
			if (A[i] != comNum) {
				if (B[i] != comNum) {
					return -1;
				}
				sum1++;
			}
			
			if (B[i] != comNum) {
				sum2++;
			}
		}
		 
		 return Math.min(sum2, sum1);
		 
		 
	    }
}
