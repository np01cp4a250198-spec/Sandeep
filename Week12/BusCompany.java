package Week12;
import java.util.ArrayList;
public class BusCompany
 {
    ArrayList<Bus> allBuses = new ArrayList<>();
    ArrayList<Bus> rateMoreThan500 = new ArrayList<>();
    ArrayList<Bus> redOrBlueBuses = new ArrayList<>();
    public void addBus(Bus b)
    {
        allBuses.add(b);
    }
    public void removeBus(int index)
    {
        allBuses.remove(index);
    }
    public void displayAll()
    {
        for (int i = 0; i < allBuses.size(); i++)
        {
            System.out.println(allBuses.get(i));
        }
    }
    public void displayRateMoreThan500() 
    {
        for (int i = 0; i < rateMoreThan500.size(); i++) 
        {
            System.out.println(rateMoreThan500.get(i));
        }
    }
    public void displayRedOrBlue() 
    {
        for (int i = 0; i < redOrBlueBuses.size(); i++)
        {
            System.out.println(redOrBlueBuses.get(i));
        }
    }
}
