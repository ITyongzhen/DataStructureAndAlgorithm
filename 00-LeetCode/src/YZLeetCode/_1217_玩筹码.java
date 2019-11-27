package YZLeetCode;
//https://leetcode-cn.com/problems/play-with-chips/
public class _1217_玩筹码 {
	 public int minCostToMoveChips(int[] chips) {
	        int odd = 0; // 奇数个数
	        int even = 0;// 偶数个数
	        
	        for (int i : chips) {
				if (i%2==0) {
					even++;
				}else {
					odd++;
				}
			}
	        return Math.min(odd, even);
	    }
}
