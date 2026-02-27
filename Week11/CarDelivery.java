package Week11;
public class CarDelivery extends Delivery implements Notifictions
{
    private static final double PER_KM_CHARGE = 50;
    private static final double MIN_PER_KM = 4;
    
    public CarDelivery(int orderId, double distance, String pickUp, String dropOff)
    {
        super(orderId, distance, pickUp, dropOff);
    }
    @Override
    public double calculateCharge()
    {
        return super.getDistance()*PER_KM_CHARGE;
    }
    @Override
    public double estimateTime()
    {
        return super.getDistance()*MIN_PER_KM;
    }
    @Override
    public void notify(String message)
    {
        System.out.println(message);
    }
}
