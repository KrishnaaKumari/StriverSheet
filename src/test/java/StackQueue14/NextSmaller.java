package StackQueue14;

public class NextSmaller {
	
public int[] prevSmaller(int[] A) {
        
        int []ans = new int[A.length];
        ans[0]=-1;
        for(int i=1 ; i<A.length ; i++)
        {
            int cnt=-1;
            for(int j=0 ; j<i ; j++)
            {
                if(A[j]<=A[i])
                    cnt=A[j];
                else if(A[j]==A[i])
                    break;
            }
            ans[i]=cnt ;
        }
        return ans ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
