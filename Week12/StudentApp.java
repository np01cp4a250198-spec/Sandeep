package Week12;
import java.util.ArrayList;
public class StudentApp
{
    public static void main(String []args)
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ayush", "L1N1", "9876543210"));
        list.add(new Student("Rahul", "L1M1", "9876543211"));
        list.add(new Student("Gaurav", "L1N2", "9876543212"));
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println(list.get(i));
        }
        list.remove(2);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.add(0, new Student("Aavaya", "L1C1", "9876543213"));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.get(2).setGroup("L1N2");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.get(1).setName("Aayush");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}