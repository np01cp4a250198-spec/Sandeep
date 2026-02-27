package Week9;
public class BankAccount
{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance)
     {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
     }
    public void deposit(double amount)
     {
         if (amount > 0)
         {
            balance += amount;
            System.out.println("Deposited: " + amount);
         }
     }
    public double getBalance()
     {
         return balance;
     }
    protected void setBalance(double balance)
     {
         this.balance = balance;
         
     }

}