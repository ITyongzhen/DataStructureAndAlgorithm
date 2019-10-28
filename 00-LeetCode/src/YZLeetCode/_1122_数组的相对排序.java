package YZLeetCode;
//https://leetcode-cn.com/problems/relative-sort-array/
public class _1122_数组的相对排序 {
	
	
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		relativeSortArray(arr1, arr2);
	}
	
	static public int[] relativeSortArray(int[] arr1, int[] arr2) {
		 
		 int[] res = new int[1001];
		 int[] reslult = new int[arr1.length];
		 
		 for (int i = 0; i < arr1.length; i++) {
			res[arr1[i]]++;
		 }
		 
		 int count = 0;
		 for (int i = 0; i < arr2.length; i++) {
			while (res[arr2[i]]>0) {
				reslult[count++] = arr2[i];
				res[arr2[i]]--;
			}
		}
		 
		 for (int i = 0; i < res.length; i++) {
			 while (res[i]>0) {
					reslult[count++] = i;
					res[i]--;
				}
		}
		 
		 
		 return reslult;
	 }
}
