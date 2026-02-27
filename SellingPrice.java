import java.util.Scanner;

public class SellingPrice
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        float mp;
        float sp;
        float discount=0;
        char category;
        System.out.println("Enter The Marked Price: ");
        mp = scan.nextFloat();
        System.out.println("Enter Category (A/B/C/D): ");
        category = scan.next().charAt(0);
        if(category == 'A' || category == 'a')
        {
            discount = 60;
        }
        else if (category == 'B' || category == 'b')
        {
            discount = 40;
            
        }
        else if (category == 'C' || category == 'c')
        {
            discount = 20;
            
        }
        else if (category == 'D' || category == 'd')
        {
            discount = 10;
            
        }
        else 
        {
            System.out.println("Invalid Category: ");
        }
        sp = mp-(mp * discount / 100);
        System.out.println("Discount Applied : " +discount + "%");
        System.out.println("Selling price: " +sp);
        
        
    }
}