package Arrays1;

import java.util.Scanner;

/**
 * 
 * You are given an array prices where prices[i] is the price of
 *  a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy
 one stock and choosing a different day in the future to sell 
 that stock.

Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.
 * @author LISA
 *
 */
public class StockBuyAndSell {

	public static int maxProfit(int[] nums) {
		int profit=0;
		int min=nums[0];
		for(int i=0 ; i<nums.length ; i++)
		{
			int curr=nums[i]-min;
			profit=Math.max(profit, curr);
			min=Math.min(min,nums[i]);
		}
		return profit ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: prices = [7,1,5,3,6,4]
//				Output: 5
//				Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//				Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]nums=new int[size];
		for(int i=0 ; i<nums.length ; i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println(maxProfit(nums));

	}

}
