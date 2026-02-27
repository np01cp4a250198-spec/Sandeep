package Week11;
public class Rectangle extends Shape implements Drawable
{
     private double length;
     private double width;
     public Rectangle(double length, double width)
     {
         this.length = length;
         this.width = width;
     }
     @Override
     public double calculateArea()
     {
         return length * width;
     }
     @Override
     public double calculatePerimeter()
     {
         return 2 * (length + width);
     }
     @Override
      public void draw() 
      {
          System.out.println("Drawing Rectangle");
      }
}