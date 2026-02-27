import java.util.Scanner;

public class GPAToGrade
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter GPA (0.0 - 4.0): ");
        double gpa = scan.nextDouble();
        if (gpa < 0.0 || gpa > 4.0)
        {
             System.out.println("Error: Invalid GPA. Please enter a value between 0.0 and 4.0.");
        }
        else 
        {
            String grade;
            
            if (gpa >= 3.6)
        {
            grade = "A+";
            
        }
        else if (gpa >=3.2)
        {
            grade = "A";
        }
        else if (gpa >=2.8)
        {
            grade = "B+";
        }
        else if (gpa >=2.4)
        {
            grade = "B";
        }
        else if (gpa >= 2.0)
        {
            grade = "C+";
            
        }
        else if (gpa >=1.6)
        {
            grade = "C";
        }
        else if (gpa >=1.0)
        {
            grade = "D";
        }
        else {
            grade  = "F";
        }
         System.out.println("Grade: " + grade);
           
              
        }
        
    }
}