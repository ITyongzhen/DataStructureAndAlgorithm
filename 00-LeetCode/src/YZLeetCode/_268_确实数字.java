package YZLeetCode;
//https://leetcode-cn.com/problems/missing-number/
public class _268_确实数字 {
	public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int max = 0;
        for(int i = 0;i<length;i++){
            sum += nums[i];
            max = Math.max(max,nums[i]);
        }
        
        int res = ((length +1)*length>>1) -sum;
        return res;
    }
}
