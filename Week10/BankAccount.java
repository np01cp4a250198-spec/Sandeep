package Week10;
public class BankAccount
{
    private long accountNumber;
    private String holderName;
    private double balance;
    
    public BankAccount(long accountNumber, String holderName, double balance)
    {
        this.accountNumber= accountNumber;
        this.holderName= holderName;
        this.balance= balance;
    }
    
    public void setAccountNumber(long newAccountNumber) 
    {
        this.accountNumber= newAccountNumber;
    }
    
    public long getAccountNumber() 
    {
        return this.accountNumber;
    }
    
    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public double calculateInterest() 
    {
        return 0;   
    }
    
    @Override
    public String toString() 
    {
        return "Account No: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance;
    }
}