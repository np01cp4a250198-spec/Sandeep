package week8;
public class Student
{
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    static String collegeName = "ABC College";
    Student(int id, String name, String address, long phoneNumber)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber; 
    }
    void displayInfo()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
}