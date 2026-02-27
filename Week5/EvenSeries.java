package Week5;
public class EvenSeries
{
    public static void main(String[] args)
    {
        System.out.println("USING FOR LOOP");
        for(int i = 1; i<=10; i++ )
        {
            System.out.print(2 * i + "");
            
        }
         System.out.println("\n\nUSING WHILE LOOP");
         int i = 1;
         while (i<=10)
         {
             System.out.print(2 * i + "");
             i++;
             
         }
         
         
       
         System.out.println("\n\nUSING DO-WHILE LOOP");
         i = 1;
         do
         {
             System.out.print(2 * i + "");
             i++;
         }
         while (i<=10);

    }         
}

