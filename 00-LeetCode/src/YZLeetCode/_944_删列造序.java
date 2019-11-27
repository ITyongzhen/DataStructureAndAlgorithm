package YZLeetCode;
//https://leetcode-cn.com/problems/delete-columns-to-make-sorted/
public class _944_删列造序 {
	
	public static void main(String[] args) {
		int res = minDeletionSize(new String[] {"cba","daf","ghi"});
	}
	
	
	static public int minDeletionSize(String[] A) {
	     if (A.length == 0 || A==null) {
			return 0;
	     }   
		 
		 int length = A.length;
		 char[][] arr = new char[length][];
		 
		 for (int i = 0; i < A.length; i++) {
			arr[i] = A[i].toCharArray();
		}
		 int res = 0;
		 for (int i = 0; i < arr[0].length; i++) {
			 
			 char curChar = arr[0][i];
			 
			for (int j = 1; j < A.length; j++) {
				 char curChar2 = arr[j][i];
				if (arr[j][i] < curChar ) {
					res++;
					curChar = arr[j][i];
					break;
				}
				curChar = arr[j][i];
			}
			 
			 
		 }
		 
		 return res;
		 
		 
	    }
}
