package YZLeetCode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode-cn.com/problems/majority-element/
public class _169_求众数 {
	 public int majorityElement(int[] nums) {
		 int sum = 0;
		 int res = 0;
		 
		 for (int num : nums) {
			if (sum == 0) {
				res = num;
			}
			sum += (num == res) ? 1 : -1;
			
		}
		 return res;
		
	 }
	 
	 public int majorityElement2(int[] nums) {
		    Map<Integer, Integer> map = new HashMap<>();
		    // maxNum 表示元素，maxCount 表示元素出现的次数
		    int maxNum = 0, maxCount = 0;
		    for (int num: nums) {
		      int count = map.getOrDefault(num, 0) + 1;
		      map.put(num, count);
		      if (count > maxCount) {
		        maxCount = count;
		        maxNum = num;
		      }
		    }
		    return maxNum;
		  }


}
