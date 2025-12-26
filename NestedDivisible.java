import java.util.Scanner;

public class NestedDivisible
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scan.nextInt();
        if (num % 3 == 0)
        {
            if (num % 5 == 0)
            {
                System.out.println("It is Divisible by both 3 and 5:");
            }
            else
            {
                System.out.println("It is Divisible by 3 but not 5");
            }
        }
            else
            {
                System.out.println("It is Not Divisible by both 3 and 5");
            }
        }
    
}