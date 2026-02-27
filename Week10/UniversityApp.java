package Week10;
public class UniversityApp
{
    public static void main(String[] args)
    {
        OnlineCourse c1= new OnlineCourse(101, "Programming in Java", 12000, 5000);
        OfflineCourse c2= new OfflineCourse(102, "Information Systems", 10000, 3000);
        c1.displayOnlineCourseDetails();
        c2.displayOfflineCourseDetails();
        
    }
}