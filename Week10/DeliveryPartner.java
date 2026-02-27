package Week10;
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    public DeliveryPartner(int partnerId, String name, double basePay)
     {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay; 
     }
    public int getPartnerId()
     {
        return partnerId; 
     }
    public void setPartnerId(int partnerId)
     {
             this.partnerId = partnerId;
     }
    public String getName()
     {
         return name;
     }
    public void setName(String name)
     {
         this.name = name;
     }
    public double getBasePay() 
    {
        return basePay;
    }

    public void setBasePay(double basePay)
    {
        this.basePay = basePay;
    }
    public double calculatePayment() 
    {
        return basePay;
    }
    @Override
    public String toString()
    {
        return "Partner ID: " + partnerId + ", Name: " + name + ", Base Pay: " + basePay;
    }
}