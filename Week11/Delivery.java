package Week11;
public abstract class Delivery
{
    private int orderId;
    private double distanceInKm;
    private String pickUpLocation;
    private String dropOffLocation;
    public Delivery(int orderId, double distance, String pickUp, String dropOff)
    {
        this.orderId = orderId;
        this.distanceInKm = distance;
        this.pickUpLocation = pickUp;
        this.dropOffLocation = dropOff;
        
    }
    public double getDistance ()
    {
        return this.distanceInKm;
    }
    public abstract double calculateCharge();
    public abstract double estimateTime();
}