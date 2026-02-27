package Week9;
public class PermanentEmployee extends Employee
{
    private double hra;
    private double da;
    public PermanentEmployee(int employeeId, String name, double basicSalary,double hra, double da)
    {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }
    public double getHra()
    {
        return hra;
    }
    public void setHra(double hra)
    {
        this.hra = hra;
        
    }
    public double getDa()
    {
        return da;
    }
    public void setDa(double da)
    {
          this.da = da;
    }
    public double calculateTotalSalary()
    {
        return getBasicSalary() + hra + da + calculateBonus();
    }
}