package YZLeetCode;
//https://leetcode-cn.com/problems/sub-sort-lcci/
public class _面试题_16_16_部分排序 {
	 public int[] subSort(int[] array) {
		 	
	        int left = -1;
	        int right = -1;
	        if (array == null || array.length == 0) {
	        	 return new int[] {left,right};
			}
	        // 找到right
	        
	        int max = array[0];
	        for (int i = 0; i < array.length; i++) {
				int temp = array[i];
				if (temp>=max) {
					max = temp;
				}else {
					right = i;
				}
			}
	        
       // 找到left
	        
	        int min = array[array.length -1];
	        for (int i= array.length -1; i >=0; i--) {
				int temp = array[i];
				if (temp<=min) {
					min = temp;
				}else {
					left = i;
				}
			}
	        
	        
	        return new int[] {left,right};
	    }
}
