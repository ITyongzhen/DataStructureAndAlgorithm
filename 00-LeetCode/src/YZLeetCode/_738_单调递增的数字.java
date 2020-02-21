package YZLeetCode;

import java.util.PriorityQueue;

//https://leetcode-cn.com/problems/monotone-increasing-digits/
public class _738_单调递增的数字 {
	
	public static void main(String[] args) {
		int res = monotoneIncreasingDigits(13432456);
	}
	
	static public int monotoneIncreasingDigits(int N) {
		
		
		
		 char[] S = String.valueOf(N).toCharArray();
		 int i = 1;
		 while (i<S.length && S[i-1] <= S[i]) {
			i++;
		}
		
		 while (0<i && i<S.length && S[i-1] > S[i]) {
			S[--i]--;
			
		}
		 
		 for (int j = i+1; j < S.length; j++) {
			S[j] = '9';
		}
		 
		 return Integer.parseInt(String.valueOf(S));
	    }
}
