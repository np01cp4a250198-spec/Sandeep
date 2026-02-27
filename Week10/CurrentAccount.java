package Week10;
public class CurrentAccount extends BankAccount
{
    public CurrentAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }
    public double calculateInterest()
    {
        double interestRate = 1.0; 
        return super.getBalance() * interestRate / 100;
    }
    public double calculateInterest(double rate)
    {
        return super.getBalance() * rate / 100;
    } 
    @Override
    public String toString()
    {
        return super.toString() + " (Current Account)";
    }
}