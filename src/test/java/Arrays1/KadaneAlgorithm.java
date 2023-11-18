package Arrays1;
/*
 * Find maximim Sum of SubArray
 * Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.
 */
import java.util.* ;
public class KadaneAlgorithm {

	public static int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE ;
        int currsum=0 ;
        for(int i=0 ; i<nums.length ; i++)
        {
        	currsum=currsum+nums[i];
        	sum=Math.max(sum, currsum);
        	if(currsum<0)
        		currsum=0 ;
        }
        return sum ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//				Output: 6
//				Explanation: The subarray [4,-1,2,1] has the largest sum 6.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(maxSubArray(arr));
	}

}
