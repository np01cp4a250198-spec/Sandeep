package Week10;
public class NormalOrder extends Order
{
    public NormalOrder(int orderId, String customerName, double amount)
    {
        super(orderId, customerName, amount);
    }
    @Override
    public double calculateFinalAmount() 
    {
        return super.getAmount() + (super.getAmount() * 0.05); 
    }
    double calculateFinalAmount(double discountAmount)
    {
        return calculateFinalAmount() - discountAmount;
    }
    @Override
    public String toString()
    {
        return super.toString() + " (Normal Order)";
    }
}