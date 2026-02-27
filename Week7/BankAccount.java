package Week7;
public class BankAccount
{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount)
    {
        balance = balance + amount;
    }
    void withdraw(double amount)
     {
         if (amount <= balance)
         {
             balance = balance - amount;
         }else
         {
             System.out.println("Insufficient balance in account " + accountNumber);
         }
         
     }
    void displayBalance()
     {
         System.out.println("Account No: " + accountNumber + ", Balance: Rs. " + balance);
         
     }
}