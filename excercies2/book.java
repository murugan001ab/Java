
import java.util.*;

public class book {
	int bookid;
	String bookname;
	String author;
	int price;
	book()
	{
		bookid=1000;
		bookname="Theory of mind";
		author="Vivek";
		price=1000;
	}
	book(int bookid,String bookname,String author)
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.author=author;
		price=0;
	}
	book(int bookid,String bookname,String author,int price)
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.author=author;
		this.price=price;
	}
	void display()
    {
    	System.out.println("Book id:"+bookid+" "+"Bookname:"+bookname+" "+"Author name: "+author+" PRICE:"+price);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		book b1=new book();
		book b2=new book(1001,"the brave mind","Barathan");
		book b3=new book(1002,"the psychological facts","Srathy",2000);
		b1.display();
		b2.display();
		b3.display();
		

	}

}



