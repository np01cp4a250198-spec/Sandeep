package Week5;
import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        char choice = 'y';
        while (choice == 'y' || choice == 'y')
    {
        System.out.println("Enter First Number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the Second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Choose Operation (+, -, *, /):");
        char op = scan.next().charAt(0);
        switch(op)
        {
            case '+' :
                System.out.println("Result = " + (num1+num2));
                break;
                case '-':
                    System.out.println("Result = " + (num1-num2));
                break;
                case '*':
                    System.out.println("Result = " + (num1*num2));
                break;
                case '/':
                    if (num2 !=0)
                    System.out.println("Result = " + (num1/num2));
                    else
                    System.out.println("Cannot Divide By Zero: ");
                break;
                default:
                    System.out.println("Invalid operation");
                }
                System.out.print("Do You Want To Continue? (y/n): ");
                choice = scan.next().charAt(0);
        }
        }
        
        
        
    }
