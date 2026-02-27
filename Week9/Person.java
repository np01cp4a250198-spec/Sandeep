package Week9;
public class Person
{
    protected int id;
    protected String name;
    protected double basicSalary;
    protected static String collegeName="Islington College";
    public Person(int id, String name, double basicSalary)
    {
        this.id= id;
        this.name= name;
        this.basicSalary= basicSalary;
    }
    public double calculateAnnualSalary()
    {
        return this.basicSalary * 12;
    }
}