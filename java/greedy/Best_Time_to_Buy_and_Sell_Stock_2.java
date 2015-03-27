public class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;

        int buy = 0;

        int sell = 1;

        while (sell < prices.length) {

            while((prices[buy] >= prices[sell]) && sell < prices.length){

                if (sell < prices.length - 1) {

                    buy ++;

                    sell ++;

                }else{

                    break;

                }

            }

            if(sell == prices.length - 1)

                return profit + (prices[sell] > prices[buy] ? prices[sell] - prices[buy] : 0);



            while((prices[sell + 1] >= prices[sell] && sell < prices.length - 1 )){

                if (sell < prices.length - 2) {

                    sell ++;

                } else {

                    sell ++;

                    break;

                }

            }

            if(sell == prices.length - 1)

                return profit + (prices[sell] > prices[buy] ? prices[sell] - prices[buy] : 0);

            profit += prices[sell] - prices[buy];

            buy = sell + 1;

            sell = buy + 1;

        }

        return profit;

    }

}
