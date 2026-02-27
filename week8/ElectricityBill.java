package week8;
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;
    ElectricityBill(String consumerName, int unitsConsumed)
    {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
        public int getUnitsConsumed()
        {
             return unitsConsumed;
        }
        public void setUnitsConsumed(int unitsConsumed)
        {
            if (unitsConsumed >= 0)
            {
                 this.unitsConsumed = unitsConsumed;
            }
        }
        public double calculateBill()
        {
            double bill = 0;
            if (unitsConsumed <= 100)
            {
                bill = unitsConsumed * 5;
            } else
            {
                bill = 100 * 5 + (unitsConsumed - 100) * 8;
            }
             return bill;
        }
        public void displayBill() 
        {
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: Rs. " + calculateBill());
        }
        
    }
