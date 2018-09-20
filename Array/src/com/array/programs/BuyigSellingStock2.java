package com.array.programs;

public class BuyigSellingStock2 {

	
	/*
	 * Given the stock prices in an array, find the maximum profit
	 *  that can be gained, if multiple transactions are allowed
	 */

		
		public static void main(String[] args) {
			int[] stockPrice = {100, 80, 120, 130, 70, 60, 100, 125};
			
			int maxPrice = findMaxProfit(stockPrice);
			
			System.out.println("the max profit that can be obtained is " + maxPrice);
		}

		//we need to find all the increasing stock pairs in array and sum the profit.
		private static int findMaxProfit(int[] stockPrice) {
			int profit = 0;
			
			for(int i=0; i<stockPrice.length - 1; i++){
				System.out.println("Before if i:" +stockPrice[i]);
				System.out.println("Bstockss i+1:" +stockPrice[i+1]);
				if(stockPrice[i+1] > stockPrice[i]){
					System.out.println("stock i:" +stockPrice[i]);
					System.out.println("stockss i+1:" +stockPrice[i+1]);
					profit = (stockPrice[i+1] - stockPrice[i]) + profit;
				}
			}
			return profit;
		}
}



//write a program to find a profitable share price in array//

/* public static void main(String[] args){
	
    int arr[]={23, 12, 286, 47, 63, 39};
   
    System.out.println("MaxProfitShare:" + findMaxProfit(arr));
    }
    
    public static int findMaxProfit(int arr[]){
    
    int profit=0;
    
    for(int i=0; i<arr.length-1;i++){
    if(arr[i+1]>arr[i]){
    profit=arr[i+1]-arr[i]+profit;
 
    }
   
    }
    return profit;
}
}
*/

