
public class his
{
	static void transactionhistory(){
        System.out.println("---------------------");
        System.out.println("Transaction History :");
        int k=0;
        if(ATM.balance>0){
        for(int i=0;i<(ATM.history.size()/2);i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(ATM.history.get(k)+" ");
                k++;
            }
            System.out.println("---------------------");
        }
        }
        else {
            System.out.println("your account is empty");
        }
        ATM.prompt();
}
}
