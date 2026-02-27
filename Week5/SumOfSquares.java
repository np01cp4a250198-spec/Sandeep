package Week5;
public class SumOfSquares
{
    public static void main(String []args)
    {
        int i = 1;
        int sum = 0;
        do 
        {
            sum += i*i;
            i++;
        }
        while (i<=10);
        System.out.println("Sum Of Squares Of First 10 Natural Numbers = " + sum);
        
        
    }
}