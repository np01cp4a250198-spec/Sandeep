package Week9;
public class Teacher extends Person
{
    private String subject;
    private double bonus;
    
    public Teacher(int id, String name, double basicSalary, String subject, double bonus)
    {
        super(id, name, basicSalary);
        this.subject= subject;
        this.bonus= bonus;
    }
    @Override
    public double calculateAnnualSalary()
    {
        return super.calculateAnnualSalary()+ bonus;
    }
}