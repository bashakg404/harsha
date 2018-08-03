	package com.array.programs;
	
	 //* Given the stock prices in an array, find the maximum profit that can be gained in one transaction.
	 
	public class BuyingSellingStock {
		
		public static void main(String[] args) {
			int[] stockPrice = {100, 80, 120, 130, 70, 60, 100, 125};
			int maxPrice = findMaxProfit(stockPrice);
			System.out.println("the max profit that can be obtained is " + maxPrice);
		}

		private static int findMaxProfit(int[] stockPrice) {
			int profit = 0;
			int minPrice = Integer.MAX_VALUE;
			
			for(int i = 0; i< stockPrice.length; i++){
				profit = Math.max(profit, stockPrice[i]-minPrice);
				minPrice = Math.min(minPrice, stockPrice[i]);
			}
			
			return profit;
		}

	}

/*
public static void main(String args[]){
	int [] stockValues={23, 47, 65, 123, 200, 390, 500};
	int maxPrice=findMaxProfit(stockValues);
	System.out.println("max profit is:" +maxPrice);
}
public static int findMaxProfit(int[] stockValues){
	int profit=0;
	for(int i=0; i<stockValues.length-1; i++){
		if(stockValues[i+1]>stockValues[i]){
			profit=(stockValues[i+1]-stockValues[i]) + profit;
		}}
		return profit;
	}
}
*/