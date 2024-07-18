/**2. Create a BankAccount class to simulate a bank account.
 *  The class should have the following attributes: account number, account holder name, and balance.
 *  Include methods to deposit(), withdraw(), and checkBalance(). Implement functionality to:
    - Create new accounts
    - Deposit money into the account
    - Withdraw money
    - Check the account balance.
*/
public class SecD2{
    public static void main(String[] args){
        BankAccount ba= new BankAccount();
        ba.num=6327492;
        ba.name="Aryan";
        ba.balance=100.00;
        ba.deposit(100.00);
        System.out.println(ba.checkBalance());
        ba.withdraw(300);
        System.out.println(ba.checkBalance());
        ba.withdraw(150);
        System.out.println(ba.checkBalance());
    }
}
class BankAccount{
    int num;
    String name;
    double balance;
    public void deposit(double amount){
        this.balance+=amount;
        
    }
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("Amount exceeds balance");
        }
        else{
            this.balance-=amount;
        }
        
        
    }
    double checkBalance(){
        return balance;
        
    }
    
    
}
