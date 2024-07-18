/*4. Design and implement a Java program that simulates a financial transaction system.
Your system should be capable of processing different types of transactions, such as deposits
and withdrawals, and alerting if any transactions exceed certain limits. Use interfaces to 
define common behaviors for transactions and implement these behaviors in different transaction classes.
Create an interface named Transaction with at least two methods: 
getAmount() which returns the amount of the transaction as a double,
and isValid() which returns a boolean indicating if the transaction is valid based on certain criteria. 
Implement the Transaction interface in at least three separate classes, DepositTransaction and WithdrawalTransaction.
Each class should have a constructor that sets a limit for transactions and specific logic to determine
if the transaction is valid */
public class SecD4{
    static void Limit(Transaction t){
        if(t.isValid()){
            System.out.println("It is valid");
        }
        else{
            System.out.println("not valid");
        }
    }
        public static void main(String[] args) {
        Transaction dt= new DepositTransaction(1000,10000);
        Transaction wt= new WithdrawlTransaction(1000,10000);
            System.out.println(dt.getAmount());
            System.out.println(wt.getAmount());
        Limit(dt);
        Limit(wt);
         
    }
}
interface Transaction{
    public double getAmount();
    public boolean isValid();
}
class DepositTransaction implements Transaction{
    private double amount;
    double limit;
    @Override
    public double getAmount(){
        return amount;
        
    }
    @Override
    public boolean isValid(){
        return amount<=limit;
    }
    DepositTransaction(double amount,double limit){
        this.amount=amount;
        this.limit=limit;
        
    }
    
}
class WithdrawlTransaction implements Transaction{
    private double amount;
    double limit;
    @Override
    public double getAmount(){
        return amount;
        
    }
    @Override
    public boolean isValid(){
        return amount<=limit;
    }
    WithdrawlTransaction(double amount,double limit){
        this.amount=amount;
        this.limit=limit;
}

}