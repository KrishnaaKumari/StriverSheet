package Arrays4;
/**
 * 
 * Given an array of integers A and an integer B.

Find the total number of subarrays having bitwise XOR of all elements equals to B.
 * @author LISA
 *
 */
public class LongestSubArrayXor {
	
	public static int longestXorLength(int[]nums,int target)
	{
		int ans=0;
		for(int i=0 ; i<nums.length ; i++)
		{
			int xor=0;
			for(int j=i ; j<nums.length ; j++)
			{
				xor=xor^nums[j];
				if(xor==target)
				{
//					ans=Math.max(ans, j-i+1);//max length
					ans++ ;//how many subarray exist
				}
			}
		}
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {5, 6, 7, 8, 9};
		int target= 5;
		//Output Format 
		//Return the total number of subarrays having bitwise XOR equals to B.
		System.out.println(longestXorLength(nums,target));

	}

}
