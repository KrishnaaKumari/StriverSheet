package Arrays3;

import java.util.*;
public class PowerFunction {
	
	public static double power(int n, double x)
	{
		int m=n;
		double pow=1;
		while(n!=0)
		{
			if(n%2!=0)
				pow=pow*x;
			x=x*x;
			n=n/2;
		}
		if(m<0)
			return (double)1/pow;
		return pow ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number x: ");
//		double x = sc.nextDouble();
//		System.out.println("Enter power n: ");
//		int n = sc.nextInt();
//		System.out.println(power(n,x));
		
		
		double d =  7;
		float f=4;
		System.out.println(d);
		System.out.println(f);
	}

}
