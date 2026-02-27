package week16;
public class Q1
{
    public static void main (String []args)
    {
        String s1 = "I AM a Java Programmer: ";
        char characterAtIndex = s1.charAt(3);
        System.out.println("The Character at given index is" + characterAtIndex);
        boolean searchOutput = s1.contains("am");
        System.out.println("Does the String contain 'am'?" + searchOutput);
        String wordInLowerCase = s1.toLowerCase();
        System.out.println("String in Lowercase: " + wordInLowerCase);
        
        
        
        
        
    }
}