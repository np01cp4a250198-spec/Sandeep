package Week9;
public class Vehicle
{
    protected int VehicleId;
    protected String Brand;
    protected double Baseprice;
    public Vehicle (int Vehicle, String Brand, double BasePrice)
    {
        this.VehicleId = VehicleId;
        this.Brand = Brand;
        this.Baseprice = Baseprice;
    }
    public void displayVehicleInfo()
    {
        System.out.println("VehicleID: " + this.VehicleId);
        System.out.println("Brand: " + this.Brand);
        System.out.println("Baseprice: " + this.Baseprice);
        
    }
    public double calculateTax()
    {
         return Baseprice * 0.10;
    }
    
}