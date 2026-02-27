import java.util.Scanner;

public class MovieTicketPricing
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age category (Child/Adult/Senior): ");
        String ageCategory = scan.next().toLowerCase();
        System.out.print("Enter movie language (Nepali/Hindi/English): ");
        String language = scan.next().toLowerCase();
        System.out.print("Do you have a student ID? (yes/no): ");
        String isStudent = scan.next().toLowerCase();
        System.out.print("Is it a festival day? (yes/no): ");
        String isFestival = scan.next().toLowerCase();
        double price = 0;
        switch (ageCategory)
        {
            case "child":
                price = 150;
                break;
            case "adult":
                price = 250;
                break;
            case "senior":
                price = 200;
                break;
            default:
                System.out.println("Invalid age category!");
                scan.close();
                return;
        }
        switch (language)
        {
            case "nepali":
                break; 
            case "hindi":
                price += 50;
                break;
            case "english":
                price += 100;
                break;
            default:
                System.out.println("Invalid movie language!");
                scan.close();
                return;
        }
        if (isStudent.equals("yes")) 
        {
            price = price - (price * 0.20);
        }
        if (isFestival.equals("yes")) 
        {
            price = price - (price * 0.15);
        }

        System.out.println("Final Ticket Price: Rs. " + price);
        
    }
}