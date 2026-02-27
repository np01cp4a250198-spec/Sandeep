import java.util.Scanner;

public class ScholarshipEligibility
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter GPA: ");
        double gpa = scan.nextDouble();
        System.out.println("Enter Attendance Percentage: ");
        double attendance = scan.nextDouble();
        System.out.println("Enter Attitude Score (1-10): ");
        int attitude = scan.nextInt();
        if (gpa >= 3.2) 
        {
            if (attendance > 80)
            {
                if (attitude < 5)
                {
                    System.out.println("Student is Eligible For The Scholarship: ");
                }
                else
                {
                    System.out.println("Student is Not Eligible For The Attitude It's Must Be Less Than 5: ");
                }
            }
            else
            {
                System.out.println("Studen is Not Eligible For For Attendance It's Must be above 80%: ");
            }
        }
        else
        {
            System.out.println("Student is Not Eligible : I'ts Must Be 3.2 or Higher: ");
        }
       
    }
}