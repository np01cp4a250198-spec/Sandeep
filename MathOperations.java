public class MathOperations
{
    public static void main (String[] args)
    {
        int a = 10;
        int b = 5;
        int c = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        System.out.println("Unary Operators:");
        System.out.println("pre-increment: ++a = " + (++a));
        System.out.println("post-increment: b++ = " + (b++));
        System.out.println("pre-decrement: --a = " + (--a));
        System.out.println("post-decrement: b-- = " + (b--));
        System.out.println("Assignment Operators:");
        a += 5;
        System.out.println("a = " + a);
        b -= 2;
        System.out.println("b = " + b);
        c *=1;
        System.out.println("c = " + c);
        System.out.println("Relational Operators:");
        System.out.println("a == b " +(a == b));
        System.out.println("a !=b " +(a !=b));
        System.out.println("a > b " +(a > b));
        System.out.println("a < b " +(a < b));
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical Operators:");
        System.out.println("condition1 && condition2 " + (condition1 && condition2));
        System.out.println("condition1 || condition2  " + (condition1 || condition2));
        System.out.println("condition1 " + (!condition1));
        int age = 20;
        System.out.println("Ternary Operator:");
        
        String result = (age >= 20) ? "Adult" : "Minor";
        System.out.println("Age " + age + " : " + result);
        
        
        
        
        
        
        
        
        
                
        
        
        
    }
}