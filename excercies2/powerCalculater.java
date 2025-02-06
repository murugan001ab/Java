

package powercalculation;
import java.util.*;


public class powercal {
	public static int power(int base,int exp)
	{
		int result=1;
		for(int i=0;i<exp;i++)
		{
			result*=base;
		}
		return result;
	}
	public static double power(double base,double exp)
	{
		 double result=1.0;
		for(int i=0;i<exp;i++)
		{
			result*=base;
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base:");
		int base=sc.nextInt();
		System.out.println("enter the exponent:");
		int exp=sc.nextInt();
		System.out.println("result1:"+power(base,exp));
		System.out.println("enter the base:");
		double base1=sc.nextDouble();
		System.out.println("enter the exponent:");
		double exp1=sc.nextDouble();
		System.out.println("result2:"+power(base1,exp1));
		

	}

}