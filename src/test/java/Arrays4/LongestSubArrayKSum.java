package Arrays4;

public class LongestSubArrayKSum {
	public static int longestSubArray(int[]nums)
	{
		int max=0;
		for(int i=0 ; i<nums.length ; i++)
		{
			int currsum=0 ;
			for(int j=i ; j<nums.length ; j++)
			{
				currsum=currsum+nums[j];
				if(currsum==0)
				{
					max=Math.max(max, j-i+1);
				}
//				
			}
		}
		return max ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {15,-2,2,-8,1,7,10,23};
		System.out.println(longestSubArray(nums));
		

	}

}
