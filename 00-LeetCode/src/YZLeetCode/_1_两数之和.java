package YZLeetCode;

import java.util.HashMap;
import java.util.LinkedList;

//https://leetcode-cn.com/problems/two-sum/
public class _1_两数之和 {
	 public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map =new HashMap<>();
	        
	        for (int i = 0; i < nums.length; i++) {
				int temp = target-nums[i];
				if (map.containsKey(temp)) {
					
					return new int[] {i,map.get(temp)};
				}else {
					map.put(nums[i], i);
				}
			}
	        return null;
	    }
}
