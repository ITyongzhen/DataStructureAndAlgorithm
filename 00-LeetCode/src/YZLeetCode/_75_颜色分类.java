package YZLeetCode;
//https://leetcode-cn.com/problems/sort-colors/
public class _75_颜色分类 {
	
	
	public void sortColors(int[] nums) {
		if (nums == null || nums.length<2) {
			return;
		}
		 int left = 0;
	     int right = nums.length -1;
	     int cur = 0;
		 while (cur<=right) {
			if (nums[cur] == 0) {
				swap(nums, left, cur);
				left++;
				cur++;
			}else if (nums[cur] == 1) {
				cur++;
			}else { //nums[cur] == 2
				swap(nums, right, cur);
				right--;
				cur++;
			}
			
		}
		
	}
	  private void swap(int[] nums, int index1, int index2){
          int temp = nums[index1];
          nums[index1] = nums[index2];
          nums[index2] = temp;
  }

	
	public void sortColors2(int[] nums) {
        if (nums.length == 0) {
			return ;
		}
        int[] res = new int[3];
        
        for (int i = 0; i < nums.length; i++) {
			res[nums[i]]++;
		}
        
        int sum=0;
        for (int i = 0; i < res.length; i++) {
			int num = res[i];
			for (int j = sum; j < sum+num; j++) {
				nums[j] = i;
			}
			sum+=num;
		}
        
        
    }
}
