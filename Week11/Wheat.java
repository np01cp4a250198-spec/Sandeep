package Week11;
public class Wheat extends Crop implements Transportable
{
     public Wheat(double landArea)
     {
         super("Wheat", "Winter", landArea);
     }
     @Override
     public double calculateYield()
     {
         return landArea * 3.0;
     }
     @Override 
     public double calculateWaterRequirement()
     {
          return landArea * 700;
     }
     @Override
     public double calculateTransportCost()
     {
         return landArea * 2500;
     }
     @Override
     public String getTransportMethod()
     {
         return "Mini Truck";
     }
     
}