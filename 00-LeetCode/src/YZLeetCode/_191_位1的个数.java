package YZLeetCode;
//https://leetcode-cn.com/problems/number-of-1-bits/
public class _191_位1的个数 {
	public int hammingWeight2(int n) {
		int sum = 0;
		while (n!=0) {
			sum++;
			n &= (n-1);
			
		}
		return sum;
	}
	 public int hammingWeight(int n) {
		 int bits = 0;
		 int mask  =1;
		 for (int i = 0; i < 32; i++) {
			if ((n&mask) != 0 ){
				bits++;
			}
			mask<<=1;
		}
		 return bits;
	    }
}
