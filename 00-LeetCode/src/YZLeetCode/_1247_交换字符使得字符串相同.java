package YZLeetCode;
//https://leetcode-cn.com/problems/minimum-swaps-to-make-strings-equal/
public class _1247_交换字符使得字符串相同 {
	 public int minimumSwap(String s1, String s2) {
	     
		 int length = s1.length();
		 int xy = 0;
		 int yx = 0;
		 char[] chars1=s1.toCharArray();
		 char[] chars2=s2.toCharArray();
		 
		 
		 for (int i = 0; i < length; i++) {
			if (chars1[i] == chars2[i]) {
				continue;
			}else if (chars1[i] == 'x') {
				xy++;
			}else {
				yx++;
			}	
		}
		 
		 return ((xy + yx) & 1) == 1 ? -1: (xy +1)/2 + (yx +1)/2;
		 
	    }
}
