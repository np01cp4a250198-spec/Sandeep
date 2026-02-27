package Week9;
public class EmployeeApp
{
    public static void main(String[] args)
    {
        PermanentEmployee p1 = new PermanentEmployee(101, "Sandeep", 30000, 8000, 5000);
        ContractEmployee c1 = new ContractEmployee(201, "Ramesh", 1200, 20);
        System.out.println("----- Permanent Employee -----");
        p1.displayEmployeeInfo();
        System.out.println("Total Salary: " + p1.calculateTotalSalary());
        System.out.println();
        System.out.println("----- Contract Employee -----");
        c1.displayEmployeeInfo();
        System.out.println("Total Salary: " + c1.calculateTotalSalary());
    
    }
    
     
}