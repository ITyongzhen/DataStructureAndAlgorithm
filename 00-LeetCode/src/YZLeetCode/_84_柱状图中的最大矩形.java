package YZLeetCode;
//https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
public class _84_柱状图中的最大矩形 {
	public static void main(String[] args) {
		int res = largestRectangleArea(new int[] {2,1,5,6,2,3});
	}
	
	
	
	
	
	 public int largestRectangleArea(int[] heights) {
		 // O(n^2)
		 int res = 0;
		 for (int i = 0; i < heights.length; i++) {
			int minHeight = Integer.MAX_VALUE;
			for (int j = i; j < heights.length; j++) {
				minHeight = Math.min(minHeight, heights[j]);
				res = Math.max(res, minHeight * (j-i+1));
			}
		}
		 
		 return res;
		 
	 }
	 
	 
	 
	static public int largestRectangleArea2(int[] heights) {
        int arse = 0;
        if (heights.length == 0) {
			return 0;
		}
       
        int[] minHeight = new int[heights.length];
        minHeight[0] = heights[0];
        arse = heights[0];
        int Thisheight = 0;
        for (int i = 1; i < heights.length; i++) {
        	minHeight[i] = Math.min(heights[i], minHeight[i-1]);
		}
		
        for (int i = 1; i < minHeight.length; i++) {
			if (heights[i]<heights[i-1]) {//当前的高度比前面的低
				//找到前面比当前低的
				
				int num = 1;
				for (int j = i-1; j >=0; j--) {
					if (minHeight[j]>=heights[i]) {
						num++;
					}else {
						break;
					}
				}
				
				if (num*heights[i] > arse) {
					Thisheight = heights[i];
					arse = num*heights[i];
				}
				
			
				
			}else {
				if (arse+Thisheight > heights[i]) {
					arse += Thisheight;
				}else {
					arse = heights[i];
					Thisheight = arse;
				}
			}
		}
		return arse;
    }
}
