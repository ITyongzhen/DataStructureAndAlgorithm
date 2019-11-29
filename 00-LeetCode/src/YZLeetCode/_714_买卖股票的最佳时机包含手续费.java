package YZLeetCode;
//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/

import java.awt.Frame;

import javax.print.attribute.standard.MediaName;

public class _714_买卖股票的最佳时机包含手续费 {
	
	public static void main(String[] args) {
		int res = maxProfit2(new int[] {4,5,2,4,3,3,1,2,5,4}, 1);
	}
	
	public int maxProfit(int[] prices, int fee) {
		
		int cash = 0; 
		int hold = -prices[0];
		for (int i = 0; i < prices.length; i++) {
			cash = Math.max(cash, hold + prices[i] - fee);
			hold = Math.max(hold, cash - prices[i]);
		}
		
		return cash;
		
	}
	static public int maxProfit2(int[] prices, int fee) {
	        int sum = 0;
	        int di = prices[0];
	        int gao = prices[0];
	        
	        for (int i = 0; i < prices.length; i++) {
				if (prices[i]>=gao) {
					gao = prices[i];
					if (i==prices.length-1) {
						sum += (gao - di) >fee ? (gao - di-fee) : 0;
					}
					
				}else {
					if ((gao - di) >fee && gao -prices[i] >=fee) {
						sum += (gao - di) >fee ? (gao - di-fee) : 0;
						gao = prices[i];
						di=prices[i];
					}else {
						di=Math.min(di, prices[i]);
						gao = prices[i];
					}	
				}
			 }
	        return sum;
	        
	    }
}
