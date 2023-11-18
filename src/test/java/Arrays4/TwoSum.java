package Arrays4;
/**
 * 
 * Given an array of integers nums and an integer target, return indices
 *  of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use
 the same element twice.

You can return the answer in any order.
 * @author LISA
 *
 */
import java.util.*;
public class TwoSum {
	
	public static  int[] twoSum(int[] nums, int target)
	{
//		int[]arr=new int[2];
//		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
//		for(int i=0 ; i<nums.length ; i++)
//		{
//			if(!hm.containsKey(target-nums[i]))
//			{
//				hm.put(nums[i],i);
//			}
//			else {
//				arr[0]=hm.get(target-nums[i]);
//				arr[1]=i;
//				return arr;
//			}
//		}
//		return arr;
		
		
		int[]arr=new int[2];
		Arrays.sort(nums);
		int i=0, j=nums.length-1;
		while(i<j)
		{
			if((nums[i]+nums[j])==target)
			{
				arr[0]=i ; arr[1]=j ; 
				return arr ;
			}
			else if((nums[i]+nums[j])>target)
				j-- ;
			else i++ ;
		}
		return arr ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
//				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
		int[]nums= {2,7,11,15};
		int[]arr=twoSum(nums,18);
		System.out.println(arr[0]+" "+arr[1]);

	}

}
