package YZLeetCode;
//https://leetcode-cn.com/problems/gas-station/solution/javashi-jian-chao-98qi-shi-zhe-dao-ti-he-qiu-zui-d/
public class _134_加油站 {
	
	public static void main(String[] args) {
		int res = canCompleteCircuit2(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2});
	}
	
	static public int canCompleteCircuit2(int[] gas, int[] cost) {
        //将问题转化为找最大子串的起始位置。
        int result = 0;
        int sum = 0;
        int hasResult = 0;//用于判断是否有跑完全程所需的油
        for (int i = 0; i < gas.length; i++) {
            hasResult +=gas[i]-cost[i];
            if(sum > 0) {
                sum += gas[i]-cost[i];
            } else {
                sum = gas[i]-cost[i];
                result = i;
            }
        }

        return hasResult>=0? result:-1;
    }


}
