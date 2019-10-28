package YZLeetCode;

import java.util.ArrayList;
import java.util.HashSet;

//https://leetcode-cn.com/problems/intersection-of-two-arrays/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
public class _349_两个数组的交集 {
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{1,2,2,1};
		int[] nums2 = new int[]{};
		
		int[] res = intersection(nums1, nums2);
		System.out.println(res);
	}
	
	
	
	static public int[] intersection(int[] nums1, int[] nums2) {
		 
	       HashSet<Integer> set1 = new HashSet<>();
	       for (Integer integer : nums1) {
			set1.add(integer);
	       }
	       
	       HashSet<Integer> set2 = new HashSet<>();
	       for (Integer integer : nums2) {
	    	   set2.add(integer);
	       }
	       
	        HashSet<Integer> resSet = new HashSet<>();
	        for (int i : set2) {
				if (set1.contains(i)) {
					resSet.add(i);
				}
			}
	        
	        int size = resSet.size();
	        int[] res = new int[size];
	        int index = 0;
	        for (Integer integer : resSet) {
				res[index++] = integer;
			}
	        
	        return res;
	     
	    }
	 
	 
	 
	 
	 
	 
}
