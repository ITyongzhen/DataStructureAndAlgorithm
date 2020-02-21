package YZLeetCode;
//https://leetcode-cn.com/problems/merge-sorted-array/
public class _88_合并两个有序数组 {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 int cur = m+n -1;
		 m--;
		 n--;
		 
		 while (n>=0) {
			if (m<0 || nums1[m] < nums2[n]) {
				nums1[cur--] = nums2[n--];
			}else {
				nums1[cur--] = nums1[m--];
			}
		}
		 
		 
		 
	    }
}
