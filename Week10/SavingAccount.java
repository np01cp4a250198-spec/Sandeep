package Week10;
public class SavingAccount extends BankAccount
{
    public SavingAccount(long accountNumber, String holderName, double balance)
    {
        super(accountNumber,  holderName, balance);
    }
    protected double getInterest()
    {
        double interestRate = 4.0;
        return super.getBalance() * interestRate / 100;
    }
    double calculateInterest(double rate) 
    {
        return super.getBalance() * rate / 100;
    }
    @Override
    public String toString() 
    {
        return super.toString() + " (Savings Account)";
    }
}