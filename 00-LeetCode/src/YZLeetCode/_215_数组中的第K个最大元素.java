package YZLeetCode;

import java.util.PriorityQueue;

//https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
public class _215_数组中的第K个最大元素 {
	 public int findKthLargest(int[] nums, int k) {
	     PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) -> n1 - n2);
		 for (Integer integer : nums) {
			heap.add(integer);
			if (heap.size()>k) {
				heap.poll();
			}
		 }
		 return heap.poll();
		 
	    }
}
