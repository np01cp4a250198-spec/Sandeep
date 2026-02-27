package Week6;
import java.util.Scanner;

public class Districts
{
    public static void main(String []args)
    {
         Scanner scan = new Scanner(System.in);
         String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
         System.out.println("Initial districts:");
        for (int i = 0; i < districts.length; i++)
        {
            System.out.println((i + 1) + ". " + districts[i]);
        }
        System.out.print("\nEnter the number of districts: ");
        int n = scan.nextInt();
        scan.nextLine();
        String[] newDistricts = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter name of district " + (i + 1) + ": ");
            newDistricts[i] = scan.nextLine();
        }
        System.out.println("\nUpdated districts:");
        for (int i = 0; i < newDistricts.length; i++)
        {
            System.out.println((i + 1) + ". " + newDistricts[i]);
        }
         
    }
}