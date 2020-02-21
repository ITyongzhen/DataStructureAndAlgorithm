package YZLeetCode;
//https://leetcode-cn.com/problems/trapping-rain-water/
public class _42_接雨水 {
		
	public static void main(String[] args) {
		int res = trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
		System.out.println(res);
	}
	
	static public int trap(int[] height) {
		int left = 0, right = height.length -1;
		int sum = 0;
		int left_max = 0,right_max = 0;
		while (left<right) {
			if (height[left] < height[right]) {
				if (height[left] >= left_max) {
					left_max = height[left];
				}else {
					sum += (left_max - height[left]);
				}
				left++;
			}else {
				if (height[right] >= right_max) {
					right_max = height[right];
				}else {
					sum += (right_max - height[right]);
				}
				right--;
			}
			
			
			
		}
			return sum;	
		
	}
	
	
	static public int trap2(int[] height) {
		 int sum = 0;
		
		 for (int i = 0; i < height.length; i++) {
			int leftMax = 0, rightMax = 0;
			for (int j = i; j >=0; j--) {
				leftMax = Math.max(leftMax, height[j]);
			}
			
			for (int j = i; j < height.length; j++) {
				rightMax = Math.max(rightMax, height[j]);
			}
			
			sum += Math.min(leftMax, rightMax) - height[i];
		}
		 return sum;
	 }
	
	
	static public int trap3(int[] height) {
	     
		 if (height.length<2) {
			return 0;
		}
		 int sum = 0;
		 int max = 0;
		 int size = height.length;
		 int[] leftMAX = new  int[size];
		 int[] rightMAX = new  int[size];
		 leftMAX[0] = height[0];
		 rightMAX[size-1] = height[size-1];
		 for (int i = 1; i < rightMAX.length; i++) {
			leftMAX[i] = Math.max(height[i], leftMAX[i-1]);
		}
		 for (int i = size-2; i >=0; i--) {
			rightMAX[i] = Math.max(height[i], rightMAX[i+1]);
		}
		 
		 for (int i = 1; i < size-1; i++) {
			 sum += Math.min(leftMAX[i], rightMAX[i]) - height[i];
		}
		 
		 
		 return sum;
	    }
}
