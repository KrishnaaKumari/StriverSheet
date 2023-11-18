package Arrays1;
/**
 * 
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 * @author LISA
 *
 */
import java.util.* ;
public class SetMatrixZeroes {

	public static void setZeroes(int[][] matrix) 
	{
		int rows=matrix.length ;
		int cols=matrix[0].length ;
		int temp=0 ;
		for(int i=0 ; i<rows ; i++)
		{
			if(matrix[i][0]==0)
				temp=1 ;
			for(int j=1 ; j<cols ; j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[i][0]=matrix[0][j]=0;
				}
			}
		}
		for(int i=rows-1 ; i>=0 ; i--)
		{
			for(int j=cols-1 ; j>=1 ; j--)
			{
				if(matrix[i][0]==0||matrix[0][j]==0)
					matrix[i][j]=0 ;
			}
			if(temp==1)
				matrix[i][0]=0 ;
		}
	}
	public static void main(String[] args) {
//		Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//				Output: [[1,0,1],[0,0,0],[1,0,1]]
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of cols: ");
		int cols=sc.nextInt();
		int[][]arr=new int[rows][cols];
		System.out.println("Enter elements for matrix: ");
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<cols ; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Output:");
		setZeroes(arr);
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<cols ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
