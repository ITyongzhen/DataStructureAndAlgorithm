package YZLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _350_两个数组的交集II {
	
	public static void main(String[] args) {
		
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
	intersect(nums1, nums2);
	}
	
	 static public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			int num = nums1[i];
			if (hash.containsKey(num)) {
				int val = hash.get(num);
				val++;
				hash.put(num, val);
			} else {
				hash.put(num, 1);
			}

		}

		int count = 0;
		
		int length = Math.max(nums1.length, nums2.length);
		int[] res = new int[length];

		for (int i = 0; i < nums2.length; i++) {
			int j = nums2[i];
			if (hash.containsKey(j)) {

				int val = hash.get(j);
				val--;
				if (val > 0) {
					hash.put(j, val);
				}else {
					hash.remove(j);
				}

				res[count++] = j;
			} else {

			}
		}

		int[] res2 = new int[count];

		for (int i = 0; i < count; i++) {
			res2[i] = res[i];

		}

		return res2;
	}
}
