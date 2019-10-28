package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/self-dividing-numbers/
public class _728_自除数 {
	
	public static void main(String[] args) {
		selfDividingNumbers(15, 16);
	}
	
	static public List<Integer> selfDividingNumbers(int left, int right) {
		 List<Integer> list = new ArrayList<>();
		 
		 int temp = left;
		 int last=left;
		 
		 for (int i = left; i <= right; i++) {
			 temp = i;
			 last = temp % 10;
			 boolean isok = true;
			 while (temp>0) {
					if (temp %10 != 0 && i % last == 0) {
						temp = temp / 10;
						last = temp % 10;
					}else {
						isok =false;
						break;
					}
			 }
			 if (isok) {
				list.add(i);
			}
		
		}
		 
		 
		 return list;
	    }
	 
	 
}
