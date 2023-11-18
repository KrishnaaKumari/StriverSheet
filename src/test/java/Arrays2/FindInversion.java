package Arrays2;

public class FindInversion {
	
	public static int getInversions(int arr[], int n) 
	{
		int cnt=0 ;
		for(int i=0 ; i<n-1 ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				if(i<j&&arr[i]>arr[j])
				{
					cnt++ ;
				}
			}
		}
		return cnt ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3, 2, 1};
		System.out.println(getInversions(arr,arr.length));

	}

}
