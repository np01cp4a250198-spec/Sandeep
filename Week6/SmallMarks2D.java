package Week6;
public class SmallMarks2D
{
    public static void main(String []args)
    {
        int[][] m = {
            {80, 75},
        };
        String[] subjects = {"Nepali", "English"};
        String[] students = {"Student 1", "Student 2"};
        System.out.print("\t");
        for (String subject : subjects)
        {
            System.out.print(subject + "\t");

        }
        System.out.println("Total");
        for (int i = 0; i < m.length; i++)
        {
            int total = 0;
            System.out.print(students[i] + "\t");
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + "\t");
                total += m[i][j];
                
            }
            System.out.println(total);
            
        }
    }
}