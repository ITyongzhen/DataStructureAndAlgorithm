package YZLeetCode;

import java.util.Arrays;

public class _455_分发饼干 {
	
	public static void main(String[] args) {
		findContentChildren(new int[] {1,2,3}, new int[] {3});
	}
	
	static public int findContentChildren(int[] g, int[] s) {
		 if (g.length == 0 || g==null || s==null || s.length == 0) {
			return 0;
		}
		 
	      Arrays.sort(g); 
	      Arrays.sort(s); 
	      int index = 0;
	      int res = 0;
	      for (int i = 0; i < g.length; i++) {
			while (index<s.length) {
				if (s[index] >= g[i]) {
					res++;
					index++;
					break;
				}
				index++;
			}
		}
	      return res;
	 }
}
