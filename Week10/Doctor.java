package Week10;
public class Doctor extends Person
{
    private String specialization;
    private double consultationFee;
    public Doctor(int id, String name, double baseSalary, String specialization, double consultationFee)
    {
        super(id, name, baseSalary);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + consultationFee;
    }
    public double calculateSalary(int emergencyCases)
    {
         return super.calculateSalary() + consultationFee + (emergencyCases * 1000);
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Specialization: " + specialization + ", Consultation Fee: " + consultationFee;
    }
}