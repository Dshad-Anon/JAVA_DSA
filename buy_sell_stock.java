public class buy_sell_stock {

    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // The buy Price will be replaced if it can't make profit.
        for(int i=0;i<prices.length;i++){
               if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice; // Profit made today.
                maxProfit = Math.max(maxProfit,profit); // Check by comparing max value between max profit and profit and replace if bigger value appears.
               }
               else{
                buyPrice = prices[i];
               }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}
