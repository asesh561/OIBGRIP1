import java.util.Scanner;

public class bankaccount 
{
    static  void register(){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Enter your name :");
        ATM.name=sc.nextLine();
        System.out.println("Enter username :");
        String user=sc.nextLine();
        System.out.println("Enter password :");
        String pass=sc.nextLine();
        System.out.println("Enter your Account number :");
        ATM.accnumber=sc.nextLine();
        System.out.println("REGISTRATION SUCCESSFULLY!");
        System.out.println("---------------------------");
        ATM.prompt();
        while(true){
            display(ATM.name);
            int choice=sc.nextInt();
            if(choice==1){
                login(user,pass);
                break;
            }
            else {
                if(choice==2){
                    System.exit(0);
                }
                else{
                    System.out.println("Bad value! Enter again!");
                }
            }
        }
    }
    static void display(String name){}
    static void login(String user,String pass){}
}

