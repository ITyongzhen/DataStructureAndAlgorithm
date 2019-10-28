package YZLeetCode;

import javax.swing.plaf.synth.Region;

// https://leetcode-cn.com/problems/remove-outermost-parentheses/
public class _1021_删除最外层的括号 {
	 public String removeOuterParentheses2(String S) {
		  char[] charArr = S.toCharArray();
		  StringBuffer sb = new StringBuffer();
		  int left = 0;
		  int right = 0;
		  for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == '(') {
				left++;
			}else {
				right++;
			}
			
			if (left == right) {
				sb.append(S.substring(i-(left+right)+2, i));
				left = 0;
				right = 0;
			}
		}
		  return sb.toString();
	 }
	 public String removeOuterParentheses(String S) {
		   char[] charArr = S.toCharArray(); // (()())(())
			StringBuilder sb = new StringBuilder();
			int p_l = 0;
			int p_r = 0;
			for (int i = 0; i < charArr.length; i++) {
				if ('(' == charArr[i]) {
					p_l++;
				}
				if (')' == charArr[i]) {
					p_r++;
				}
				//找到原语
				if (p_l == p_r) {
					sb.append(S.substring(i - p_l * 2 + 2, i));
					p_l = 0;
					p_r = 0;
				}
			}
			return sb.toString();

	 }
}
