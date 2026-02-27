package Week6;
import java.util.Scanner;

public class StudentArray
{
    public static void main(String []args)
    {
        String[] students = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        System.out.println("Student Names:");
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
        System.out.println("\nName at index 2: " + students[2]);
        students[4] = "Anisha";
        System.out.println("Updated name at index 4: " + students[4]);
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a new student name to replace index 1: ");
        students[1] = scan.nextLine();
        System.out.println("\nUpdated Student List:");
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
    }
}