package Arrays4;

import java.util.Arrays;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int ans=1;
		int cnt=1;
		for(int i=1 ; i<nums.length ; i++)
		{
			if(nums[i]==nums[i-1])
				continue ;
			else if(nums[i]==(nums[i-1]+1))
			{
				cnt++ ;
				ans=Math.max(cnt, ans);
			}
			else {
				
				cnt=1;
			}
		}
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {100,4,200,1,3,2};
		System.out.println("Longest consecutive sequence: "+longestConsecutive(nums));

	}

}
