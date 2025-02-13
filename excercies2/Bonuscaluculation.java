

import java.util.*;
public class Bonuscaluculation {
	double bonus(double salary)
	{
		return salary*0.05;
	}
	double bonus(int performancerate,double salary)
	{
		if(performancerate>=5)
		{
			return salary*0.20;
		}
		else if(performancerate>=3)
		{
			return salary*0.10;
		}
		else if(performancerate>=3)
		{
			return salary*0.10;
		}
		else {
			return salary*0.05;
		}
	}
	double bonus(int performancerate,double salary,int experience)
	{
		double basebonus=bonus(performancerate,salary);
		if(experience>=5)
		{
			basebonus+= salary*0.10;
		}
		return basebonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Bonuscaluculation emp=new Bonuscaluculation();
       System.out.println("Enter salary:");
       double salary=sc.nextDouble();
       System.out.println("Enter performancearete:");
       int prate=sc.nextInt();
       System.out.println("Enter yrofexperience:");
       int exp=sc.nextInt();
       System.out.println("Employee salary based on salary only:"+emp.bonus(salary));
       System.out.println("Employee salary based on salary & performancerate:"+emp.bonus(prate,salary));
       System.out.println("Employee salary based on salary&performace&yrofexperience:"+emp.bonus(prate,salary,exp));
	}

}


