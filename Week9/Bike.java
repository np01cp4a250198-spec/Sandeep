package Week9;
public class Bike extends Vehicle
{
    private int engineCapacity;
    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity)
    {
        super(vehicleId, brand, basePrice);
        this.engineCapacity= engineCapacity;
    }
    public double calculateFinalPrice()
    {
        return super.Baseprice+ super.calculateTax();
    }
    public void displayBikeDetails()
    {
        System.out.println("------------Bike Details-------------");
        super.displayVehicleInfo();
        System.out.println("Fuel type: "+ this.engineCapacity);
        System.out.println("-------------------------------------");
    }
}