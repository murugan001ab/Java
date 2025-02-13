
import java.util.*;

public class bank {
    private String name;
    private int ac_no;
    private double balance;
    private String ac_type;

    bank() {
        name = "unknown";
        ac_no = 0;
        balance = 0.0;
        ac_type = "Savings";
    }

    bank(String name, int ac_no, double balance) {
        this.name = name;
        this.ac_no = ac_no;
        this.balance = balance;
        this.ac_type = "";
    }

    bank(String name, int ac_no, double balance, String ac_type) {
        this.name = name;
        this.ac_no = ac_no;
        this.balance = balance;
        this.ac_type = ac_type;
    }

    void display() {
        System.out.println("ACCOUNT HOLDER NAME: " + name);
        System.out.println("ACCOUNT NUMBER: " + ac_no);
        System.out.println("BALANCE AMOUNT: " + balance);
        System.out.println("ACCOUNT TYPE: " + ac_type);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account Information Interview!");
        System.out.println("Please choose how you want to enter the account details:");

        System.out.println("1. Enter all account details");
        System.out.println("2. Enter account holder name and type only");
        System.out.println("3. Use default account details");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();  

        bank account = null;

        switch (choice) {
            case 1:
                System.out.print("Enter account holder name: ");
                String name = sc.nextLine();
                System.out.print("Enter account number: ");
                int ac_no = sc.nextInt();
                System.out.print("Enter initial balance: ");
                double balance = sc.nextDouble();
                sc.nextLine(); // Consume newline
                System.out.print("Enter account type: ");
                String ac_type = sc.nextLine();
                account = new bank(name, ac_no, balance, ac_type);
                break;

            case 2:
                System.out.print("Enter account holder name: ");
                String name2 = sc.nextLine();
                System.out.print("Enter account number: ");
                int ac_no2 = sc.nextInt();
                System.out.print("Enter initial balance: ");
                double balance2 = sc.nextDouble();
                account = new bank(name2, ac_no2, balance2);
                break;

            case 3:
                account = new bank();
                break;

            default:
                System.out.println("Invalid choice! Using default account details.");
                account = new bank();
                break;
        }

        account.display();
        sc.close();
    }
}



