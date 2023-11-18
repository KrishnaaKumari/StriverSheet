package Arrays4;

public class LongestIncreasingSubsequence {
	
	public static int lengthOfLIS(int[] nums)
	{
		int[]list=new int[nums.length];
		for(int i=0 ; i<nums.length ; i++)
		{
			list[i]=1;
			for(int j=0 ; j<i ; j++)
			{
				if(nums[i]<nums[j] &&list[j]>=list[i])
				{
					list[i]=list[j]+1;
				}
			}
		}
		int max=1 ;
		for(int i=0 ; i<list.length ; i++)
		{
			max=Math.max(max,list[i]);
		}
		return max ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(nums));

	}

}
