package week8;
public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(30000);
        System.out.println("Basic Salary: Rs. " + emp.getBasicSalary());
        System.out.println("Gross Salary: Rs. " + emp.calculateGrossSalary());
    }
}