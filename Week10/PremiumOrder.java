package Week10;
public class PremiumOrder extends Order
{
   public PremiumOrder(int orderId, String customerName, double amount) 
   {
        super(orderId, customerName, amount);
   } 
   @Override
   public double calculateFinalAmount()
   {
        return super.getAmount() + (super.getAmount() * 0.10) + 50;
   }
   public double calculateFinalAmount(double discountAmount)
   {
        return calculateFinalAmount() - discountAmount;
   }
   @Override
   public String toString()
   {
        return super.toString() + " (Premium Order)";
   }
}