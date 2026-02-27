package Week7;
public class Mobile
{
    String brand;
    double price;
    boolean isAffordable()
    {
        if (price < 20000)
        {
            return true;
        } else
        {
            return false;
        }
    }
}