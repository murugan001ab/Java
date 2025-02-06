
package employeeusingconstructor;
import java.util.*;
class employee
{
	int id;
	String name;
	int salary;
	employee()
	{
		id=100;
		name="Ram";
		salary=50000;
		
	}
	employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		this.salary=0;
	}
	employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Id:"+id+" "+"Name:"+name+" "+"salary:"+salary);
	}
}

public class employeeconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        employee emp1=new employee();
        employee emp2=new employee(101,"Raja");
        employee emp3=new employee(102,"akssh",60000);
        emp1.display();
        emp2.display();
        emp3.display();
	}

}
