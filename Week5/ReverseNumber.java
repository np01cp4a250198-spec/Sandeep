package Week5;
import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int reverse = 0;
        while (num!=0)
        {
            int digit  = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
            
        }
        System.out.println("Reversed Number: " + reverse);
        
        
        
    }
}