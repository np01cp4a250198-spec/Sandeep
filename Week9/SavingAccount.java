package Week9;
public class SavingAccount extends BankAccount
{
     private double interestRate;
     public SavingAccount(int accountNumber, String name, double balance, double interestRate)
     {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
     }
     public double calculateInterest()
     {
         return super.getBalance() * interestRate / 100;
     }
}