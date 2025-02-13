

import java.util.*;


public class arraysum1 {

	public static int arrsum(int[] arr,int n)

	{

		int sum=0;

		for(int i=0;i<arr.length;i++)

		{

			sum+=arr[i];

		}

		return sum;

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE LENGTH OF AN ARRAY:");

		int n=sc.nextInt();

		int[] arr=new int[n];

		System.out.println("Enter the elements:");

		for (int i=0;i<n;i++)

		{

			arr[i]=sc.nextInt();

		}

		System.out.println("ARRAY SUM IS:"+arrsum(arr,n));

	}


}