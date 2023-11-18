package Arrays3;

public class MajorityN_3 {

	public static int majorityElement(int[] nums)
	{
		int ans=0;
		int ele=0;
		int cnt=0;
		for(int i=0 ; i<nums.length ; i++)
		{
			if(cnt==0)
			{
				cnt++;ele=nums[i];
			}
			else if(ele==nums[i])
			{
				cnt++;
			}
			else {
				cnt-- ;
			}
		}
		for(int i=0 ; i<nums.length ; i++)
		{
			if(ele==nums[i])
				ans++;
		}
		if(ans>nums.length/3)
			return ele;
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {2,2,1,1,1,2,2};
		System.out.println("Majority element is "+majorityElement(nums));
				

	}


}
