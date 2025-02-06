import java.util.*;
class addition_basic{

    public static String cancate(String a,String b){
        return a+b;
    }
    public static void main(String[] arg){
        Scanner in =new Scanner(System.in);
        System.out.println("enter First name: ");
        String Firstname=in.next();
        System.out.println("enter Last  name: ");

        String Lastname=in.next();
        String name=cancate(Firstname,Lastname);
        System.out.println("the addition "+Firstname+" and "+Lastname+" is:"+name);
    }
}