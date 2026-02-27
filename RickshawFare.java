import java.util.Scanner;

public class RickshawFare
{
    public static void main(String []args)
    {
        double basefare = 50;
        double perkmrate = 20;
        double perminuterate = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Distance in (km): ");
        double distance = scan.nextDouble();
        System.out.println("Enter Time in (minutes): ");
        int time = scan.nextInt();
        System.out.println("Is Customer Local? (True/False): ");
        boolean islocal  = scan.nextBoolean();
        System.out.println("Is it Night Time? (True/False): ");
        boolean isnight = scan.nextBoolean();
        double totalfare = basefare + (distance * perkmrate) + (time * perminuterate);
        totalfare = (islocal && distance > 5) ? totalfare * 0.9 : totalfare;
        totalfare = isnight ? totalfare * 1.2 : totalfare;
        System.out.println("Final Fare: RS." + totalfare);
        
        
        
        
        
        
    }
}