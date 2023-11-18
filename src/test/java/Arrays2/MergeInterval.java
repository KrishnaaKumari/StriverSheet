package Arrays2;
/*
 *  Given an array of intervals, merge all the overlapping 
 *  intervals and return an array of non-overlapping intervals.
 * 
 */
import java.util.*;
public class MergeInterval {
	
	public static int[][] merge(int[][] intervals)
	{
		List<int[]>res= new ArrayList<int[]>();
		//sort
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
		
		int start=intervals[0][0];
		int end=intervals[0][1];
		for(int i=1 ; i<intervals.length ; i++)
		{
			if(intervals[i][0]<end)
				end=Math.max(end, intervals[i][1]);
			else {
				int[]a=new int[2];
				a[0]=start;a[1]=end;
				res.add(a);
				start=intervals[i][0];
				end=intervals[i][1];
			}
		}
		int[]arr=new int[2];
		arr[0]=start;
		arr[1]=end;
		res.add(arr);
		return res.toArray(new int[0][]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]intervals = {{1,3},{2,6},{8,10},{15,18}};
		intervals=merge(intervals);
		for(int i=0 ; i<intervals.length ; i++)
			{
				System.out.println(intervals[i][0]+" "+intervals[i][1]);
			}
	}

}
