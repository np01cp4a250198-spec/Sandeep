package week8;
public class Atm
{
    public static void main(String[] args)
    {
         BankAccount acc = new BankAccount(1001, "Ram Sharma", 5000);
          acc.deposit(2000);
          if (acc.withdraw(3000))
          {
              System.out.println("Withdrawal successful");
          } else 
          {
              System.out.println("Withdrawal failed");
          }
          System.out.println("Current Balance: Rs. " + acc.getBalance());
    }
}