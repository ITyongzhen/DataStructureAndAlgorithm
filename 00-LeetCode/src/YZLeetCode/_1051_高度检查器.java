package YZLeetCode;


// https://leetcode-cn.com/problems/height-checker/
/*
 *  输入：[1,1,4,2,1,3]
 *  	  1,1,1,2,3,4
	输出：3
	解释：
	高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。
	
	1 <= heights.length <= 100
	1 <= heights[i] <= 100

 * 
 */
public class _1051_高度检查器 {
	public static void main(String[] args) {
		_1051_高度检查器 a = new _1051_高度检查器();
		int[] arr = new int[] {
				1,1,4,2,1,3
		};
		int k = a.heightChecker(arr);
	}
	
	public int heightChecker(int[] heights) {
		int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {        	
            while (arr[i]-- > 0) {
                if (heights[j++] != i) count++;
            }


        }
        return count;

		
    }
}
