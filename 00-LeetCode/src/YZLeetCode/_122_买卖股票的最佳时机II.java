package YZLeetCode;
//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
public class _122_买卖股票的最佳时机II {
	public int maxProfit(int[] prices) {
		if (prices.length == 0 || prices == null) {
			return 0;
		}
        int sum  = 0;
        int pre  = prices[0];
		int mairu = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i]>pre ) {
				if (i==prices.length-1) {
					sum += Math.max(prices[i]-mairu, 0);
				}
			}else {
				sum += pre - mairu;
				
				mairu =  prices[i];
			}
			pre = prices[i];
		}
		return sum;
    }
}
