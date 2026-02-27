package Week9;
public class Employee
{
    protected int employeeId;
    protected String name;
    protected double basicSalary;
    public Employee(int employeeId, String name, double basicSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;  
    }
    public double getBasicSalary(){
        return basicSalary;
    }
    public double calculateBonus()
    {
        return basicSalary * 0.10;
    }
    public void displayEmployeeInfo()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}