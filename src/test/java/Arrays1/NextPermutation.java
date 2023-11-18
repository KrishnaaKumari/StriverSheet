package Arrays1;

public class NextPermutation {
	public static void reverse(int[]nums, int s, int e)
	{
		while(s<e)
		{
			int t=nums[s];
			nums[s]=nums[e];
			nums[e]=t;
			s++ ; e-- ;
		}
	}
	 public static void nextPermutation(int[] nums) {
		 int idx=-1;
		 for(int i=nums.length-2 ; i>=0 ; i--)
		 {
			 if(nums[i]<nums[i+1])
			 {
				 idx=i; break;
			 }
		 }
		 if(idx==-1)
		 {
			 reverse(nums,0,nums.length-1);
			 return ;
		 }
		 for(int i=nums.length-1 ; i>=0 ; i--)
		 {
			 if(nums[i]>nums[idx])
			 {
				 int t=nums[i];
					nums[i]=nums[idx];
					nums[idx]=t;
					break;
			 }
		 }
		 reverse(nums,idx+1,nums.length-1);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1 , 2 , 0 , 5 , 1};
		nextPermutation(arr);
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
