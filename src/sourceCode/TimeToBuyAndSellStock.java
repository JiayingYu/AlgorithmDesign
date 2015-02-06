package sourceCode;

public class TimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1)
			return 0;
		int minPrice = prices[0];
		int maxProfit = 0;
		for (int x : prices) {
			minPrice = Math.min(minPrice, x);
			maxProfit = Math.max(maxProfit, x - minPrice);
		}
		return maxProfit;
	}
}
