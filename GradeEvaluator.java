import java.util.Scanner;

public class GradeEvaluator
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Grade: ");
        int grade = sc.nextInt();
        String result = (grade >= 40)? "Pass" : "Fail";
        System.out.println("\tResult: \t " +result);
        
        
        
        
    }
}