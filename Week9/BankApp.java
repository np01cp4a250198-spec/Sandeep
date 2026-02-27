package Week9;
public class BankApp
{
    public static void main(String[] args)
    {
        SavingAccount s1 = new SavingAccount(101, "Sandeep", 50000, 5);
        System.out.println("Saving Account Balance: " + s1.getBalance());
        System.out.println("Interest Earned: " + s1.calculateInterest());
        System.out.println();
        CurrentAccount c1 = new CurrentAccount(201, "Ramesh", 20000, 10000);
        c1.deposit(5000);
        c1.withdraw(30000);
        System.out.println("Current Account Balance: " + c1.getBalance());
    }
}