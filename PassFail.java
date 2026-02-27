import java.util.Scanner;

public class PassFail
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Marks: ");
        int marks = scan.nextInt();
        if (marks >= 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        
        
    }
}