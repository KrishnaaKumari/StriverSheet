package Arrays4;

import java.util.*;

public class FourSum {
	
	 public static List<List<Integer>> fourSum(int[] nums, int target)
	 {
		 Arrays.sort(nums);
		 Set<List<Integer>> res= new HashSet<List<Integer>>();
		 int cnt=0 ;
		 for(int i=0 ; i<nums.length ; i++)
		 {
			 if(nums[i]>=0) continue;
			 else cnt++ ;
		 }
		 if(target<0&&cnt==0)
			 return (new ArrayList<>(res)) ;
		 
		 for(int i=0 ; i<nums.length-3 ; i++)
		 {
			 for(int j=i+1 ; j<nums.length-2 ; j++)
			 {
				 int left=j+1, right=nums.length-1;
				 while(left<right)
				 {
					 int sum=nums[i]+nums[j]+nums[left]+nums[right];
					 if(sum==target)
					 {
						 List<Integer>al=new ArrayList<>();
						 al.add(nums[i]);al.add(nums[j]);
						 al.add(nums[left]);al.add(nums[right]);
						 res.add(al);
						 left++ ; right-- ;
						 
						 while(left<right&&nums[left]==nums[left-1]) left++ ;
						 while(left<right&&nums[right]==nums[right+1]) right-- ;
					 }
					 else if(sum>target) right-- ;
					 else left++ ;
				 }
			 }
		 }
		 return (new ArrayList<>(res));
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,0,-1,0,-2,2};
		List<List<Integer>> ans = fourSum(nums,0);
		for(List<Integer>li : ans)
		{
			for(Integer i :li)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
