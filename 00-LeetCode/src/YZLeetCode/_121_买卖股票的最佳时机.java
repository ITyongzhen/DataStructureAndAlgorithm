package YZLeetCode;
//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
public class _121_买卖股票的最佳时机 {
	public static void main(String[] args) {
	
	}
	
	 public int maxProfit(int[] prices) {
		 int minPrice = Integer.MAX_VALUE;
		 int maxprofit = 0;
		 for (int i = 0; i < prices.length; i++) {
			if (prices[i]<minPrice) {
				minPrice = prices[i];
			}else if (prices[i]-minPrice >maxprofit) {
				maxprofit = prices[i]-minPrice;
			}
		}
		 return maxprofit;
	 }
	static public int maxProfit1(int[] prices) {
	        if (prices.length == 0 || prices == null) {
				return 0;
			}
	        int max = 0;
	       
	        for (int i = prices.length-1; i >0; i--) {
	        	int cur = prices[i];
	        	 int min = Integer.MAX_VALUE;
				for (int j = i-1; j >=0; j--) {
					if (prices[j]<cur) {
						min=Math.min(min, prices[j]);
					}
				}
				max=Math.max(max, cur-min);
			}
		 
	        return max;
	    }
	 public int maxProfit2(int[] prices) {
	        if (prices.length == 0 || prices == null) {
				return 0;
			}
	        int max = 0;
	        for (int i = 0; i < prices.length; i++) {
				max = Math.max(getMaxProfix(i, prices), max);
			}
		 
	        return max;
	    }
	 
	 private int getMaxProfix(int index,int[] prices) {
		 int max = 0;
		 int temp = prices[index];
		 int theIndex = index;
		 
		 for (int i = index; i < prices.length; i++) {
			 max = Math.max(max, prices[] - temp);
		}
		 
		 return max;
	 }
}
