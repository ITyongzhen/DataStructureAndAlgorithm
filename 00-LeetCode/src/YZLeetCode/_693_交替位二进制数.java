package YZLeetCode;

import java.awt.image.RescaleOp;

//https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
public class _693_交替位二进制数 {
	 public boolean hasAlternatingBits(int n) {
		 int num = n;
		 num >>=1;
		 int res = n^num;
	     return (res & (res+1)) == 0;
	    }
}
