package Week10;
public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    public Order(int orderId, String customerName, double amount)
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
     public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public double calculateFinalAmount() 
    {
        return amount;
    }
    @Override
    public String toString()
    {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Amount: " + amount;
    }

}