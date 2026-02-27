package Week10;
public class BikeDelivery extends DeliveryPartner
{
    public BikeDelivery(int partnerId, String name, double basePay) 
    {
        super(partnerId, name, basePay);
    }
    @Override
    public double calculatePayment()
    {
        return super.calculatePayment() + 1000; 
    }
    public double calculatePayment(int extraOrders) 
    {
        return calculatePayment() + (extraOrders * 50);
    }
}