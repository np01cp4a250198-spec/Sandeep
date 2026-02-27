package Week10;
public class BankingApp
{ 
    public static void main(String[] args) 
    {

        SavingAccount sa = new SavingAccount(101, "Sandeep", 50000);
        CurrentAccount ca = new CurrentAccount(201, "Ramesh", 30000);

        System.out.println("----- Savings Account -----");
        System.out.println(sa);
        System.out.println("Interest (Default Rate): " + sa.calculateInterest());
        System.out.println("Interest (Custom Rate 5%): " + sa.calculateInterest(5));

        System.out.println();

        System.out.println("----- Current Account -----");
        System.out.println(ca);
        System.out.println("Interest (Default Rate): " + ca.calculateInterest());
        System.out.println("Interest (Custom Rate 2%): " + ca.calculateInterest(2));
    }
}