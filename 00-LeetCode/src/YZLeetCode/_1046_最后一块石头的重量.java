package YZLeetCode;

import java.sql.Array;
import java.util.Arrays;

//https://leetcode-cn.com/problems/last-stone-weight/
public class _1046_最后一块石头的重量 {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		
		for (int i = stones.length-1; i >=0; i--) {
			Arrays.sort(stones);
			stones[stones.length-1] = stones[stones.length-1] - stones[stones.length-2];
			stones[stones.length-2] = 0;
		}
		return stones[stones.length - 1];
    }
}
