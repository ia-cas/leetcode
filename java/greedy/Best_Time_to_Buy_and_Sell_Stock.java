public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int imin = 0;
        int imax = prices.length  > 1 ? 1:0;
        while(prices[imax] <= prices[imin]){
            if (imax < prices.length - 1 && imin < prices.length - 1) {
                imax ++;
                imin ++;
            } else {
                return 0;
            }
        }
        int max = prices[imax];
        int min = prices[imin];
        int profit = max - min;
        for (int i = imax+1; i < prices.length; i++) {
            int temp = prices[i];
            if(temp - min > profit){
                profit = temp  - min;
            }
            min = min<temp?min:temp;
        }
        return profit;
    }
}
