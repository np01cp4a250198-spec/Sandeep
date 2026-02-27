package Week11;
public abstract class Crop
{
    protected String cropName;
    protected String season;
    protected double landArea;
    public Crop(String cropName, String season, double landArea)
    {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }
    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();
    public void displayCropInfo()
    {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Season: " + season);
        System.out.println("Land Area: " + landArea + " hectares");
        System.out.println("Estimated Yield: " + calculateYield() + " tons");
        System.out.println("Water Requirement: " + calculateWaterRequirement() + " units");
    }
    
}