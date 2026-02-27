package Week10;
public class Course
{
    private int courseId;
    private String courseName;
    private double baseFee;
    
    public Course(int courseId, String courseName, double baseFee)
    {
        this.courseId= courseId;
        this.courseName= courseName;
        this.baseFee= baseFee;
    }
    
    public void setCourseId(int newId)
    {
        this.courseId= newId;
    }
    
    public int getCourseId()
    {
        return this.courseId;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public double getBaseFee()
    {
        return this.baseFee;
    }
    protected double calculateFee()
    {
        return this.baseFee;
    }

     protected double calculateFee(double discountAmount)
    {
        return this.baseFee - discountAmount;
    }
    
    public void displayCourseDetails()
    {
        System.out.println("Course ID: "+ getCourseId());
        System.out.println("Course Name: "+ getCourseName());
    }
}