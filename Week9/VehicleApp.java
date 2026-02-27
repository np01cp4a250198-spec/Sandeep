package Week9;
public class VehicleApp
{
    public static void main(String[] args)
    {
        Car c1= new Car(101, "Toyota", 2500000, 4, "Petrol");
        c1.displayCarDetails();
        Bike b1= new Bike(201,"Honda", 300000, 320);
        b1.displayBikeDetails();
    }
}