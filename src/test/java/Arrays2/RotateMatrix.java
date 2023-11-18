package Arrays2;
/**
 * You are given an n x n 2D matrix representing an image,
 *  rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to
 modify the input 2D matrix directly. DO NOT allocate another 
 2D matrix and do the rotation.
 * 
 * @author LISA
 *
 */
import java.util.*;
public class RotateMatrix {
	
	public static void rotate(int[][] matrix) 
	{
		int n=matrix.length;
		//transpose
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<i ; j++)
			{
				int t=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=t;
			}
		}
		//swapping
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n/2 ; j++)
			{
				int t=matrix[i][j];
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=t;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//				Output: [[7,4,1],[8,5,2],[9,6,3]]
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int[][]matrix=new int[n][n];
		System.out.println("Enter Array Elements: ");
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
				matrix[i][j]=sc.nextInt();
		}
		rotate(matrix);
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		
	}

}
