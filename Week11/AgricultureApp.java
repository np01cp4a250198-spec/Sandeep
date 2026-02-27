package Week11;
public class AgricultureApp
{
    public static void main(String[] args)
    {
        Crop[] crops = new Crop[3];
        crops[0] = new Rice(1.5);
        crops[1] = new Wheat(1.0);
        crops[2] = new Maize(0.8);
    for(Crop crop : crops)
    {
        crop.displayCropInfo();
        Transportable t = (Transportable) crop;
        System.out.println("Transport Method: " + t.getTransportMethod());
        System.out.println("Transport Cost: Rs. " + t.calculateTransportCost());
    }
    
    }
}