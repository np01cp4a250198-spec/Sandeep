package Week17;
public class Student
{
    private String studentId;
    private String name;
    private String course;
    public Student(String studentId, String name, String course)
    {
        this.studentId = studentId;
        this.name = name;
        this.course = course;

    }
    public String getStudentId()
    {
         return studentId;

    }
    public String getName() 
    {
        return name;
    }

    public String getCourse() 
    {
        return course;
    }
    public String toHtml() 
    {
        return "<html>" +
                "<h2>Student ID Card</h2>" +
                "<p><b>ID:</b> " + studentId + "</p>" +
                "<p><b>Name:</b> " + name + "</p>" +
                "<p><b>Course:</b> " + course + "</p>" +
                "</html>";
    }
}