package week8;
public class Patient
{
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    Patient(String patientName, int age, int daysAdmitted, double dailyCharge)
    {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    public int getDaysAdmitted()
    {
        return daysAdmitted;
    }
    public void setDaysAdmitted(int daysAdmitted)
    {
         if (daysAdmitted > 0)
         {
             this.daysAdmitted = daysAdmitted;
         }
    }
    public double calculateTotalBill()
    {
     double total = dailyCharge * daysAdmitted;
    
    if (daysAdmitted > 7)
    {
        total = total - (0.10 * total);
    }
    return total;
    }
    public void displayDetails()
    {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: Rs. " + dailyCharge);
        System.out.println("Total Bill: Rs. " + calculateTotalBill());
        System.out.println("-------------------------------");
    }

}