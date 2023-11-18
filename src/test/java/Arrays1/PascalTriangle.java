package Arrays1;
import java.util.* ;
public class PascalTriangle {

	public static List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>>ans=new ArrayList<List<Integer>>();
		List<Integer>firstrow=new ArrayList<Integer>();
		firstrow.add(1);
		ans.add(firstrow);
		for(int i=1 ; i<numRows ; i++)
		{
			List<Integer>prevrow=ans.get(i-1);
			List<Integer>currow=new ArrayList<Integer>();
			currow.add(1);
			for(int j=1 ; j<i ; j++)
			{
				currow.add(prevrow.get(j)+prevrow.get(j-1));
			}
			currow.add(1);
			ans.add(currow);
		}
		return ans ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: numRows = 5
//				Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		List<List<Integer>> ans = generate(rows);
		for(List<Integer> li : ans)
		{
			for(Integer i : li)
				System.out.print(i+" ");
			System.out.println();
		}
	}

}
