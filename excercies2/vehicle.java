
import java.util.*;

public class vehicle {
	String modelname;
	int year;
	String color;
	int price;
	vehicle()
	{
		modelname="BMW";
		year=2000;
		color="Blue";
		price=5000000;
	}
	vehicle(String modelname,int year,String color)
	{
		this.modelname=modelname;
		this.year=year;
		this.color=color;
		this.price=0;
	}
	vehicle(String modelname,int year,String color,int price)
	{
		this.modelname=modelname;
		this.year=year;
		this.color=color;
		this.price=price;
	}
    void display()
    {
    	System.out.println("MODELNAME:"+modelname+" "+"YEAR:"+year+" "+"COLOR: "+color+" PRICE:"+price);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		vehicle v1=new vehicle();
		vehicle v2=new vehicle("AUDI",2000,"RED");
		vehicle v3=new vehicle("BENZ",1992," YELLOW",4000000);
		v1.display();
		v2.display();
		v3.display();
		
		

	}

}


