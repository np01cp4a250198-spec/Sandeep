import java.util.Scanner;

public class SellingPriceSwitch
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        float mp;
        float sp;
        float discount=0;
        char category;
        System.out.println("Enter The Marked Price: ");
        mp = scan.nextFloat();
        System.out.println("Enter Category (A/B/C/D): ");
        category = scan.next().charAt(0);
        
        switch (category)
        {
            case 'A':
            case 'a':
                  discount = 60;
                    break;
                    case 'B':
                        case 'b':
                            discount = 40;
                            break;
                            case 'C':
                                case'c':
                                discount = 20;
                                break;
                                case 'D':
                                    case'd':
                                    discount = 10;
                                    break;
                                    default:
                                        System.out.println("Invalid Category! ");
                    
            }
            sp = mp - (mp * discount / 100);
            System.out.println("Discount Applied: " + discount + "%");
            System.out.println("Selling price: " + sp);
    } 
}