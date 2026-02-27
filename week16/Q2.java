package week16;
public class Q2
{
    public static void main (String []args)
    {
        String s1 = " Hello world ";
        String [] splitArray = s1.split(" ");
        System.out.println(s1);
        String s2;
        if (s1.length() >= 10) 
        {
            s2 = s1.substring(0, 10);
        } else 
        {
            s2 = s1;
        }
        System.out.println("First 10 characters: " + s2);
        String[] words = s1.split(" ");
        System.out.println("Words in string:");
        for (String word : splitArray)
        {
             System.out.println(word);

        }

        
    }
}