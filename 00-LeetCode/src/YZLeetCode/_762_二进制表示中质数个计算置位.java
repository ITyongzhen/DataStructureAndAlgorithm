package YZLeetCode;

import java.io.ObjectInputStream.GetField;

public class _762_二进制表示中质数个计算置位 {
	
	public int countPrimeSetBits2(int L, int R) {
		int[] primes = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};
		int res = 0;
		 for (int i = L; i <= R; i++) {
				
				int t = Integer.bitCount(i);
				res += primes[t];
		      }
		      
		      return res;
		
	}
	
public int countPrimeSetBits(int L, int R) {
        int res = 0;
      for (int i = L; i <= R; i++) {
		
		int t = Integer.bitCount(i);
		if(isZhishu(t)) {
			res += 1;
		}
      }
      
      return res;
    }

	private boolean isZhishu(int num) {
		
		if(num<2)return false;
		
		for(int i = 2;i<num;i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
