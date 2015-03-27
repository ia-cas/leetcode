public class Solution {
    	public static int maxProfit(int[] prices) {
		if(prices.length<2) return 0;
		int profit = 0;
		int min_price = prices[0];
	
		for(int i=0;i<prices.length;i++) {
			min_price = Math.min(min_price, prices[i]);
			profit = Math.max(profit, prices[i]-min_price);
		}
		
		return profit;
	}
}
