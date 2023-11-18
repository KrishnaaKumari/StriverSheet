package Arrays3;

public class GridUniquePath {

//	public static int uniquehelper(int i, int j, int rows, int cols)
//	{
//		if((i==rows-1) && (j==cols-1))
//			return 1;
//		if(i>=rows && j>=cols)
//			return 0;
//		return uniquehelper(i+1,j,rows,cols)+uniquehelper(i,j+1,rows,cols);
//	}
	public static int uniquePaths(int m, int n)
	{
//        return uniquehelper(0,0,m,n);
		int[][]dp=new int[m][n];
		for(int i=0 ; i<m ; i++)
		{
			dp[i][0]=1;
		}
		for(int j=0 ; j<n ; j++)
		{
			dp[0][j]=1 ;
		}
		for(int i=1 ; i<m ; i++)
		{
			for(int j=1 ; j<n ; j++)
			{
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3, n=7;
		System.out.println(uniquePaths(3,7));

	}

}
