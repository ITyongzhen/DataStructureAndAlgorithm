package YZLeetCode;

import java.util.ArrayList;

public class _976_三角形的最大周长 {
    int[] newArray;
  	// 归并排序
	 public int largestPerimeter(int[] A) {
		 newArray = new int[A.length>>1];
		 
		sort(0,A.length,A);
		
		for (int i = A.length-1; i > 1; i--) {
			if (A[i] < A[i-1]+A[i-2]) {
				return A[i] + A[i-1] + A[i-2];
			}
		}
		 return 0;
	}
	
	
	private void sort(int begin,int end,int[] A) {
		if(end-begin<2)return;
		int middle = (begin+end) >>1;
		sort(begin, middle, A);
		sort(middle, end,A);
		merge(begin, middle, end, A);
	}
	
	private void merge(int begin,int middle,int end,int[] A) {
		int li = 0;
		int le=middle-begin;
		int ri=middle;
		int re=end;
		int ai=begin;
		
		//备份左侧
		
		for (int i = li; i < le; i++) {
			newArray[i] = A[begin+i];
		}
		
		while (li<le) {
			if (ri<re && A[ri]<newArray[li]) {
				A[ai++] = A[ri++];
			}else {
				A[ai++] = newArray[li++];
			}
			
		}
		
    }
	
	
	
	
	// 冒泡
	static public int largestPerimeter2(int[] A) {

		
		for (int end = A.length-1; end >0; end--) {
			 for (int begin = 0; begin < end; begin++) {
			    	if (A[begin]>A[begin+1]) {
						int temp = A[begin];
						A[begin] = A[begin+1];
						A[begin+1] = temp;
					}
				}  
			
		}
	     
		
		for (int i = A.length-1; i > 1; i--) {
			if (A[i] < A[i-1]+A[i-2]) {
				return A[i] + A[i-1] + A[i-2];
			}
			
		}
		
		 return 0;
	    }
	 
	 
	 
	 
}
