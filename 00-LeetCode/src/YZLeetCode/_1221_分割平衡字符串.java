package YZLeetCode;
//https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
public class _1221_分割平衡字符串 {
	public int balancedStringSplit(String s) {
        int res = 0;
        int leftNum = 0;
        int rightNum = 0;
        char[] sARR = s.toCharArray();
        
       for (char c : sARR) {
    	   
		if (c=='L') {
			leftNum++;
		}
		if (c=='R') {
			rightNum++;
		}
		if (leftNum == rightNum) {
			leftNum = 0;
			rightNum = 0;
			res++;
		}
		
	}
		
		
		return res;
    }
}
