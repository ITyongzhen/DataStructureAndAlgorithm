package YZLeetCode;

import java.util.Arrays;

public class _455_分发饼干 {
		public static void main(String[] args) {
				int a = findContentChildren(new int[] {1,2}, new int[] {1,2,3});		
				System.out.println(a);
		}
	static public int findContentChildren(int[] g, int[] s) {
		if (g==null || g.length == 0 || s == null || s.length == 0) {
			return 0;
		}
		Arrays.sort(g);
		Arrays.sort(s);
		int sum = 0;
		int sindex = 0;
		for (int i = 0; i < g.length; i++) {
			int gvalue = g[i];
			while (sindex <s.length && s[sindex] < gvalue) {
				sindex++;
			}
			
			
			//分配完了
			if (sindex==s.length || i == g.length) {
				break;
			}
			sum++;
			sindex++;
		}
		
		return sum;
	}
	
//	public static void main(String[] args) {
//		findContentChildren(new int[] {1,2,3}, new int[] {3});
//	}
//	
//	static public int findContentChildren(int[] g, int[] s) {
//		 if (g.length == 0 || g==null || s==null || s.length == 0) {
//			return 0;
//		}
//		 
//	      Arrays.sort(g); 
//	      Arrays.sort(s); 
//	      int index = 0;
//	      int res = 0;
//	      for (int i = 0; i < g.length; i++) {
//			while (index<s.length) {
//				if (s[index] >= g[i]) {
//					res++;
//					index++;
//					break;
//				}
//				index++;
//			}
//		}
//	      return res;
//	 }
}
