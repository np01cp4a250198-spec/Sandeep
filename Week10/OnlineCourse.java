package Week10;
public class OnlineCourse extends Course
{
    private double platformFee;
    
    public OnlineCourse(int courseId, String courseName, double baseFee, double platformFee)
    {
        super(courseId, courseName, baseFee);
        this.platformFee= platformFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getBaseFee() + this.platformFee;
    }
    
    public void displayOnlineCourseDetails()
    {
        super.displayCourseDetails(); 
        System.out.println("Total fee for this online course: "+ this.calculateFee());
        
    }
}