import java.util.*;
class addition_basic{

    public static int addition(int a,int b){
        return a+b;
    }
    public static void main(String[] arg){
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int add=addition(num1,num2);
        System.out.println("the addition "+num1+" and "+num2+" is:"+add);
    }
}