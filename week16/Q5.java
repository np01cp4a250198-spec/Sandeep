package week16;
import java.util.Scanner;

public class Q5
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String second = sc.nextLine();
        StringBuilder sb = new StringBuilder(first);
        sb.append(second);
        sb.append(100);
        sb.append('!');
        System.out.println("Final String: " + sb.toString());

    }
}