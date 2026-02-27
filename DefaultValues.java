public class DefaultValues
{
    // instance variable 
    
    char myChar;
    byte myByte;
    short myShort;
    int age;
    long myLong;
    float Myfloat;
    double myDouble;
    boolean myboolean;
    
    
    public static void main(String []args)
    {

        DefaultValues df= new DefaultValues(); // instance variable calling in static context // object
        System.out.println(df.myChar);
        System.out.println(df.myByte);
        System.out.println(df.myShort);
        System.out.println(df.age);
        System.out.println(df.myLong);
        System.out.println(df.Myfloat);
        System.out.println(df.myDouble);
        System.out.println(df.myboolean);
        
        
    }
}