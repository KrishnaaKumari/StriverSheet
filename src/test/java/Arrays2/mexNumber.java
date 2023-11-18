package Arrays2;

import java.util.Arrays;

/*
 * You are given an array arr[] of size N, the task is to determine the MEX of the array.

    MEX is the smallest whole number that is not present in the array.

Examples:

    Input: arr[] = {1, 0, 2, 4}
    Output: 3
    Explanation: 3 is the smallest whole number that is not present in the array
 * 
 */
public class mexNumber {
	
	public static int findMex(int[]nums)
	{
		Arrays.sort(nums);
		int mex=0 ;
		for(int i=0 ; i<nums.length ; i++)
		{
			if(nums[i]==mex)
				mex++ ;
		}
		return mex ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1, 0, 2, 4};
		System.out.println(findMex(arr));

	}

}
