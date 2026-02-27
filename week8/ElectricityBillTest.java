package week8;
public class ElectricityBillTest
{
    public static void main(String[] args)
    {
         ElectricityBill bill1 = new ElectricityBill("Ram Sharma", 150);
         bill1.displayBill();
         System.out.println();
          bill1.setUnitsConsumed(90);
        bill1.displayBill();
    }
}