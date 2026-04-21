package week21;
public class Employee {
    private String empId, name, salary, employmentType, benefits, department;

    public Employee(String empId, String name, String salary, String employmentType,
            String benefits, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.employmentType = employmentType;
        this.benefits = benefits;
        this.department = department;
    }

    public String[] getEmployeeData() {
        return new String[] {
            "ID: " + empId,
            "Name: " + name,
            "Salary: " + salary,
            "Type: " + employmentType,
            "Benefits: " + benefits,
            "Department: " + department
        };
    }
}
