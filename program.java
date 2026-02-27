import java.util.Scanner;

public class program
{
    public static void main(String[] args)
    {
        System.out.println("First Workshop of Programming.");
        System.out.println("First Workshop of Programming.");
        System.out.println(20);
        int age = 19;
         System.out.println(age);
         double weight = 75.90;
         System.out.println(weight);
         String name = "Sandeep";
         System.out.println(name);
         
        
         int a= 10;
         
         int b=12;
         // post increment, pre increment 
         
         // a++, ++a
         
         System.out.println(a); // 10
         System.out.println(++a);  // ++a => 11 , a=11
         System.out.println(a); // a= 11
         System.out.println(a++); // a++ => 11, a=12
         System.out.println(a); // a=> 12
         
         
         // Scanner class
         
         Scanner scan= new Scanner(System.in);
         
         System.out.println("Pass me a number");
         
         int num1= scan.nextInt();
         System.out.println(num1);
         
         System.out.println("Pass me another number");
         
         double num2= scan.nextDouble();
         
         System.out.println(num2);
         
         // String, character
         
         int agee= 17;
         
         String isValid= (agee>= 18)? "Eligible for citizenship" : "Not eligible for citizenship" ;
         System.out.println(isValid);
         
         
         
         
         
    
         
         
         
         
         
         
         
         
         
         
         
         
         
    
}
}