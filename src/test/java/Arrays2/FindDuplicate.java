package Arrays2;
import java.util.*;
public class FindDuplicate {
	
	public static int findDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else{
                return nums[i];
            }
        }
        return -1 ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,3,4,2,2};
		System.out.println(findDuplicate(arr));

	}

}
