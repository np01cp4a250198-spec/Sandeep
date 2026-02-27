package Week9;
public class SchoolApp
{
    public static void main(String[] args)
    {
        Teacher t1= new Teacher(2001, "Sandeep", 45000, "Programming", 6000);
        t1.calculateAnnualSalary();
        
        Staff s1= new Staff(2012, "Susu", 25000, 12, 250);
        s1.calculateSalary();
    }
}