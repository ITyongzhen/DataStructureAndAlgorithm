package YZLeetCode;
// https://leetcode-cn.com/problems/next-greater-element-i/
public class _496_下一个更大的元素I {
	
	
	 public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
		   if(nums1==null||nums1.length==0)
	            return new int[0];
	        
			int length1 = nums1.length;
			int length2 = nums2.length;
			int[] result = new int[length1];
			
			
			// find the max value and min value in the nums2 array
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i=0;i<length2;i++){
				max = Math.max(max,nums2[i]);
				min = Math.min(min,nums2[i]);
			}
			
			// create a sortted array mapping the value to the index of nums2 array
			max = Math.max(Math.abs(max),Math.abs(min));
			int length = 0;
			boolean flag = min<0;
			if(flag)
				length = (max<<1)+1;
			else
				length = max+1;
			int[] map = new int[length];
			
			
			for(int i=0;i<length2;i++){
				if(flag)
					map[nums2[i]+max]=i;
				else
					map[nums2[i]]=i;
			}
			
			for(int i=0;i<length1;i++){
				result[i] = -1;
				int position = flag?nums1[i]+max:nums1[i];
				int index = map[position];
				for(int j=index+1;j<length2;j++){
	                int num1 = nums1[i];
	                if(num1<nums2[j]){
	                    result[i]=nums2[j];
	                    break;
	                }
	            }
			}
			
			return result;
		}
		 
		 
	 
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        // 输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
		 	// 输出: [-1,3,-1]
		 int len1 = nums1.length;
		 int len2 = nums2.length;
		 int[] array = new int[len1];
		 
		 
		 
		 for (int i = 0; i < len1; i++) {
			int k = nums1[i];
			
			int pointer = 0;
			for (int j = 0; j < len2; j++) {
				
				if (k == nums2[j]) {
					pointer = 1;
					continue;
				}
				
				if (pointer == 1 ) {
					
					int res = nums2[j];
						if ( res > k) {
							array[i] = res;
							pointer = 0;
							break;
						} 
						
					}
					
				}
			if (pointer == 1) {
					array[i] = -1;
				}
				
			}
		
		 
		 
		 return array;
	    }

//	private setArry


}
