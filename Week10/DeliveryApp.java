package Week10;
public class DeliveryApp
{
    public static void main(String[] args)
    {
        BikeDelivery b1 = new BikeDelivery(101, "Sandeep", 12000);

        CarDelivery c1 = new CarDelivery(201, "Ramesh", 15000);
        System.out.println("----- Bike Delivery Partner -----");
        System.out.println(b1);
        System.out.println("Payment (Normal): " + b1.calculatePayment());
        System.out.println("Payment (With Extra Orders): " + b1.calculatePayment(5));
        System.out.println();
        System.out.println("----- Car Delivery Partner -----");
        System.out.println(c1);
        System.out.println("Payment (Normal): " + c1.calculatePayment());
        System.out.println("Payment (With Extra Orders): " + c1.calculatePayment(3));
    }
}