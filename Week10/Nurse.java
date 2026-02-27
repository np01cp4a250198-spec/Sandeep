package Week10;
public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    public Nurse(int id, String name, double baseSalary, String shift, double extraAllowance)
    {
        super(id, name, baseSalary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    @Override
    public double calculateSalary()
    {
         return super.calculateSalary() + extraAllowance;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Shift: " + shift + ", Extra Allowance: " + extraAllowance;
    }
    
}