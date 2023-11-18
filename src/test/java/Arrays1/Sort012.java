package Arrays1;
/*
 *Given an array nums with n objects colored red, white, or blue, sort them in-place
 * so that objects of the same color are adjacent, with the colors in the order red, 
 * white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
 respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 
 * 
 */
import java.util.* ;
public class Sort012 {
	
	public static void swap(int[]nums, int i, int k)
	{
		int t=nums[i];
		nums[i]=nums[k];
		nums[k]=t ;
	}
	public static void sortColors(int[] nums) {
		int j=0, k=nums.length-1 ;
		int i=0 ;
       while(i<=k)
        {
        	if(nums[i]==0)
        	{
        		swap(nums,i,j);
        		i++ ;j++ ;
        	}
        	else if(nums[i]==1)
        	{
        		i++ ;
        	}
        	else if(nums[i]==2)
        	{
        		swap(nums,i,k);
        		k-- ;
        	}
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]nums=new int[size];
		for(int i=0 ; i<nums.length ; i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("After sorting: ");
		sortColors(nums);
		for(int i=0 ; i<nums.length ; i++)
		{
			System.out.print(nums[i]+" ");
		}

	}

}
