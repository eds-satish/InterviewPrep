public class buy {
	public static void main(String[] args){
		int[] test_arr = {993,543,757,113,584,817,582,638,174,368,830,97,715,175};
		maximizeProfit(test_arr);
	}

	public static void maximizeProfit(int[] prices){
 		int lowIndex = 0;
 		int highIndex = 0;
		int low = prices[0];
	    int high = prices[0];
		int profit = 0;
		int tempLowIndex = 0;

		for(int i = 0; i < prices.length; ++i){
			//buy low
			if(prices[i] < low){
				low = prices[i];
				tempLowIndex = i;
				high = 0;
			}
			else if(prices[i] > high){ //sell high
				high = prices[i];
				int potenProfit = (high - low); //potentialProfit
				if(potenProfit > profit ){
					profit = potenProfit;
					highIndex = i;
					lowIndex = tempLowIndex;
				}
			}
		}
 		System.out.println(lowIndex + " BUY");
 		System.out.println(highIndex + " SELL");
	}
}