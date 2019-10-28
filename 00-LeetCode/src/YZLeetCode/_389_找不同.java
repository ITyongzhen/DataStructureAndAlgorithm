package YZLeetCode;
//https://leetcode-cn.com/problems/find-the-difference/
public class _389_找不同 {
	 public char findTheDifference(String s, String t) {
	      int sLength = s.length();
	      int a = 0;
	      for (int i = 0; i < sLength; i++) {
			a = a ^ s.charAt(i) ^ t.charAt(i);
	      }
	      a = a^t.charAt(sLength);
	      return (char)a;
	    }
}

