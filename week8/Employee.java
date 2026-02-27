package week8;
public class Employee
{
    private double basicSalary;
    Employee(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    double calculateGrossSalary()
    {
        return basicSalary + (0.20 * basicSalary);
    }
    double getBasicSalary()
    {
        return basicSalary;
    }
}