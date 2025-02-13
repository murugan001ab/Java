
import java.util.*;
class areacal
{
	//calculate the area of square
	public int area(int side)
	{
		return side*side;
	}
	//calculate the area of rectangle
	public int area(int l,int b)
	{
		return l*b;
	}
	public double area(double b,double h)
	{
		return (b*h)/2;
	}
}

public class areacalculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		areacal cal=new areacal();
		System.out.println("ENTER THE SIDE FOR SQUARE:");
		int a=sc.nextInt();
		int area1=cal.area(a);
		
		System.out.println("ENTER THE LENGHTH:");
		int l=sc.nextInt();
		System.out.println("ENTER BREADTH:");
		int b=sc.nextInt();
		int area2=cal.area(l,b);
		
		System.out.println("ENTER THE height:");
		double h=sc.nextDouble();
		System.out.println("ENTER BREADTH:");
		double w=sc.nextDouble();
		double area3=cal.area(h,w);
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);

	}

}
