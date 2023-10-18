package leetcode;

public class Q121 {

  public static void main(String[] args) {
    int[] a = { 7,1,5,3,6,4 };
    System.out.println(new Q121().maxProfit(a));
  }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(prices[i], min);
        }
        
        return profit;
    }
}
