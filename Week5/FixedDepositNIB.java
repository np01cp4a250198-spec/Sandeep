package Week5;
import java.util.Scanner;

public class FixedDepositNIB
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principle Amount: ");
        double p = scan.nextDouble();
        System.out.println("Enter the Annual interest Rate (%): " );
        double rate = scan.nextDouble();
        System.out.println("Enter the Duration:  ");
        double years = scan.nextDouble();
        double months = years * 12 ;
        double monthlyrate = rate / 100 / 12;
        double  a = p;
        int i = 1;
        while (i<= months)
        {
            a = a + (a*rate);
            i++;
        }
        double feerate = 0.005;
        double fee = a * feerate;
        double finalamount = a - fee;
        System.out.println("\n----- FIXED DEPOSIT DETAILS -----");
        System.out.println("Principal (P): Rs. " + p);
        System.out.println("Annual Rate: " + rate + "%");
        System.out.println("Duration: " + years + " years");
        System.out.println("Total Months: " + months);
        System.out.println("Maturity Amount (A): Rs. " + a);
        System.out.println("Processing Fee: Rs. " + fee);
        System.out.println("Final Amount Received: Rs. " + finalamount);

        
        }
        
        
        
        
        
    }
