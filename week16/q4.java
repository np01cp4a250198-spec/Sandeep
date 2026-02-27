package week16;
public class q4
{
    public static void main(String []args)
    {
        String word = "Never forget Some Memories: ";
        String wordInUppercase = word.toUpperCase();
        System.out.println("String in Upper Case: " + wordInUppercase);
        String wordInLowercase = word.toLowerCase();
        System.out.println("String in Lower Case: " + wordInLowercase);
         String[] words = word.toLowerCase().split(" ");
        String title = "";
        for (String s1 : words) 
        {
            if (word.length() > 0) 
            {
                title += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        System.out.println("Title Case: " + title.trim());
        
    }
}