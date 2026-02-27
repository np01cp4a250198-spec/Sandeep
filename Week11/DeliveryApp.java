package Week11;
public class DeliveryApp
{
    public static void mainp(String []args)
    {
        Delivery d1 = new CarDelivery(101, 10, "Gaighat", "jaljale");
        System.out.println(d1.calculateCharge());
        Delivery s1 = new BikeDelivery(102, 18, "udayapur", "Deuri");
        System.out.println(s1.estimateTime());
        Notifictions c1 = new CarDelivery(101, 10, "Gaighat", "jaljale");
        c1.notify("Your Order Has Been Placed");
    }
    
}