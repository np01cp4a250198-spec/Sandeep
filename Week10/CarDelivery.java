package Week10;
public class CarDelivery extends DeliveryPartner
{
    public CarDelivery(int partnerId, String name, double basePay)
    {
        super(partnerId, name, basePay);
    } 
    @Override
    public double calculatePayment()
    {
        return super.calculatePayment() + 3000; 
    }
    public double calculatePayment(int extraOrders)
    {
        return calculatePayment() + (extraOrders * 100);
    }
}