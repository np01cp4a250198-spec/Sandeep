package Week7;
public class Result
{
    int subject1;
    int subject2;
    int subject3;
    int calculateTotal()
    {
         return subject1 + subject2 + subject3;
    }
    double calculatePercentage()
    {
        return calculateTotal() / 3.0;
    }
    void displayResult()
    {
        System.out.println("Marks: " + subject1 + ", " + subject2 + ", " + subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}