public class AushadhiPasal
{
    public static void main(String[] args)
    {
        String med1 = "Paracetamol";
        double price1 = 5.0;
        int stock1 = 120;
        boolean pres1 = false;
        
        String med2 = "Amoxicillin";
        double price2 = 12.0;
        int stock2 = 60;
        boolean pres2 = true;
        
        String med3 = "Cetirizine";
        double price3 = 8.0;
        int stock3 = 80;
        boolean pres3 = false;
        
        
        System.out.println("==========================================================");
        System.out.println("-----------AUSHADHI PASAL INVENTORY REPORT----------------");
        System.out.println("==========================================================");
        System.out.println("Medicine Name            | Price | Stock | Prescription Required");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-25s | %-5.2f | %-5d | %s%n",med1, price1, stock1, pres1 ? "Yes" : "No");
        System.out.printf("%-25s | %-5.2f | %-5d | %s%n",med2, price2, stock2, pres2 ? "Yes" : "No");
        System.out.printf("%-25s | %-5.2f | %-5d | %s%n",med3, price3, stock3, pres3 ? "Yes" : "No");
        System.out.println("----------------------------------------------------------");
        System.out.println("-------------- End of Inventory Report--------------------");
        System.out.println("==========================================================");
        
        
        
    }
    
    
}