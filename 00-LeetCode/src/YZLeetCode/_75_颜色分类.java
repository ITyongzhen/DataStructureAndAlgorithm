package YZLeetCode;
//https://leetcode-cn.com/problems/sort-colors/
public class _75_颜色分类 {
	public void sortColors(int[] nums) {
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
