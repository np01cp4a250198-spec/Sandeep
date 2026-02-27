import java.util.Scanner;

public class IncomeTaxCalculato
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual income (NPR): ");
        double income = scan.nextDouble();

        double tax = 0;

        if (income <= 500000) 
        {
            tax = income * 0.01;
        } 
        else if (income <= 700000)
        {
            tax = (500000 * 0.01) 
                + ((income - 500000) * 0.10);
        } 
        else 
        {
            tax = (500000 * 0.01) 
                + (200000 * 0.10) 
                + ((income - 700000) * 0.20);
        }

        System.out.println("Total Tax Payable: NPR " + tax);
    }
}