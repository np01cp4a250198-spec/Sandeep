package Week9;
public class CurrentAccount extends BankAccount 
{ 
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, String name, double balance, double overdraftLimit)
    {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double amount)
    {
        if (amount <= getBalance() + overdraftLimit)
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            return true;
        } else
        {
            System.out.println("Withdrawal denied!");
            return false;
        }
    }
}