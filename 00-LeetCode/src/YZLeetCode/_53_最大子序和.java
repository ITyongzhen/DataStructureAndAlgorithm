package YZLeetCode;
//https://leetcode-cn.com/problems/maximum-subarray/
public class _53_最大子序和 {
	int[] maxArr;
	
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int sum = 0;
		int ans = nums[0];
		
		for (int num : nums) {
			if (sum>0) {
				sum+=num;
			}else {
				sum = num;
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}
	
	public int maxSubArray2(int[] nums) {
		
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = nums[0];
		
		maxArr = new int[nums.length];
		
        for (int i = nums.length-1; i >=0; i--) {
			max = Math.max(max, max(i, nums));
		}
		return max;
    }
	
	private int max(int index,int[] nums) {
		if (index<0 || index>=nums.length) {
			return 0;
		}
		if (index == 0) {
			return nums[0];
		}
		int cur = nums[index];
		int preMax = max(index-1, nums);
		if (preMax>0) {
			maxArr[index] = preMax+cur;
			return  preMax+cur;
		}else {
			maxArr[index] = cur;
			return cur;
		}
	}
}
