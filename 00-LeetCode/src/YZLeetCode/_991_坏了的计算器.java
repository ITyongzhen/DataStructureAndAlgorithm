package YZLeetCode;
//https://leetcode-cn.com/problems/broken-calculator/
public class _991_坏了的计算器 {
	 public int brokenCalc(int X, int Y) {
	        
		int res = 0;
		while (Y>X) {
			res++;
			if (Y %2  == 1) {
				Y++;
			}else {
				Y >>= 1;
			}
		}
		
		 return res + X - Y;
		 
	    }
}
