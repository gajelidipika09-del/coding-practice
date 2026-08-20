package firstprogram;

public class LeetCode121_Best_Timeto_Buy_and_Sell_Stock {
	
	    public static int maxProfit(int[] prices) {

	        int left = 0;
	        int maxProfit = 0;

	        for (int right = 1; right < prices.length; right++) {

	            if (prices[right] < prices[left]) {
	                left = right;
	            } 
	            else {

	                int profit = prices[right] - prices[left];

	                if (profit > maxProfit) {
	                    maxProfit = profit;
	                }
	            }
	        }

	        return maxProfit;
	    }

	    public static void main(String[] args) {

	        int[] prices = {7, 1, 5, 3, 6, 4};

	        int result = maxProfit(prices);

	        System.out.println("Maximum Profit: " + result);
	    }
	}

