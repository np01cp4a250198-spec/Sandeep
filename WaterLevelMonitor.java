import java.util.Scanner;

public class WaterLevelMonitor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Current Water Level in Liters: ");
        double waterlevel = scan.nextDouble();
        System.out.println("Current Water Level: " + waterlevel + "L" );
        String message = (waterlevel >= 1000)? "WARNING: Water Level has Reached 1000L or More!!" : "STATUS: NORMAL";
        System.out.println(message);
        
        
        
        
    }
}