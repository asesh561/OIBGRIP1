import java.util.ArrayList;
import java.util.Scanner;

public class ATM 
{
	 public static String name;
	    public static int balance=0;
	    public static String accnumber;
	    public static ArrayList<String> history=new ArrayList<String>();

	    static void updatebalance(int dcash){
	        balance=balance+dcash;
	    }
	    static void showbalance(){
	        System.out.println(balance);
	    }
	    public static void homepage(){
	        System.out.println("\033[H\033[2J");
	        Scanner sc=new Scanner(System.in);
	        System.out.println("WELCOME TO ATM INTERFACE");
	        System.out.println("--------------------------");
	        System.out.println("select option :");
	        System.out.println("1. Register");
	        System.out.println("2. Exit");
	        System.out.println("Enter choice");
	        int choice =sc.nextInt();
	        if (choice==1){
	                bankaccount.register();
	        }
	        else {
	            if(choice==2){
	                System.exit(0);
	            }
	            else{
	                System.out.println("select a value only from the given options :");
	                homepage();
	            }
	        }
	    }
	    static void prompt(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("WELCOME "+ATM.name+"! TO ATM SYSTEM");
	        System.out.println("---------------------");
	        System.out.println("Select option : ");
	        System.out.println("1. Withdraw");
	        System.out.println("2. Deposit");
	        System.out.println("3. Transfer");
	        System.out.println("4. Check balance");
	        System.out.println("5. Transaction History");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice : ");
	        int choice=sc.nextInt();
	        switch (choice) {
	            case 1:
	                transaction.withdraw();
	            case 2:
	                transaction.deposit();
	            case 3:
	                transaction.transfer();
	            case 4:
	                check.checkbalance();
	            case 5:
	                his.transactionhistory();
	            case 6:
	                System.exit(0);
	        }
	    }

	    public static void main(String[] args) {
	        homepage();
	    }
}
