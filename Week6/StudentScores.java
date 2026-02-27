package Week6;
import java.util.Scanner;

public class StudentScores
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int[] scores = {10, 20, 30, 40, 50};
        System.out.println("Initial scores:");
        for (int score : scores)
        {
            System.out.print(score + " ");
            
        }
        System.out.println();
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int score : scores)
        {
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }
        double average = (double) sum / scores.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.print("\nEnter the number of subjects: ");
        int n = scan.nextInt();
        int[] newScores = new int[n];
        for (int i = 0; i < n; i++)
         {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            newScores[i] = scan.nextInt();
             
             
         }
        System.out.println("\nUpdated scores:");
        sum = 0;
        max = newScores[0];
        min = newScores[0];
        for (int score : newScores)
        {
             System.out.print(score + " ");
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }
        average = (double) sum / newScores.length;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        
        
    }
}