package Arrays3;

public class SearchIn2DArray {
	
	public static boolean searchMatrix(int[][] matrix, int target)
	{
        int r=matrix.length ;
        int c=matrix[0].length;
        int l=0 ;
        int h=r*c-1;
        while(l<=h)
        {
        	int m=(l+h)/2;
        	int element=matrix[m/c][m%c];
        	if(element==target)
        		return true ;
        	else if(element>target)
        		h=m-1;
        	else
        		l=m+1;
        }
        return false ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 13;
		System.out.println(searchMatrix(matrix,target));

	}

}
