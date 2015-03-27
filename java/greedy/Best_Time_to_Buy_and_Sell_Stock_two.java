public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int maxprofit = 0;
		int maxprice = prices[0];
		int buyprice = prices[0];
		for(int i=1;i<prices.length;i++) {
			if(prices[i]>=maxprice) maxprice = prices[i];
			else {
				maxprofit = maxprofit + maxprice - buyprice;
				buyprice = prices[i];
				maxprice = prices[i];
			}		
		}
		maxprofit = maxprofit + maxprice - buyprice;
		return maxprofit;
    }
}
