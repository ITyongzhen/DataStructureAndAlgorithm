package YZLeetCode;
//https://leetcode-cn.com/problems/range-sum-query-immutable/
public class _303_区域和检索_数组不可变 {
	private int[] resnums;
	 public NumArray(int[] nums) {
//		 resnums = nums;
		 
		 resnums = new int[nums.length + 1];
		 for (int i = 0; i < nums.length; i++) {
			resnums[i+1] = resnums[i] + nums[i];
		}
		
	    }
	    
	  public int sumRange2(int i, int j) {
	    	return resnums[j+1] - resnums[i];
	    }
	  
	    public int sumRange1(int i, int j) {
	    	int sum = 0;
	        for (int j2 = i; j2 <= j; j2++) {
				sum+=resnums[j2];
			}
	        return sum;
	    }
}
