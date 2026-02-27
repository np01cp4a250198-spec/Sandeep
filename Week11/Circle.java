package Week11;
public class Circle extends Shape implements Drawable
{
     private double radius;
     public Circle(double radius)
     {
         this.radius = radius;
     }
     @Override
      public double calculateArea()
      {
          return Math.PI * radius * radius;
      }
     @Override
      public double calculatePerimeter() 
      {
          return 2 * Math.PI * radius;
      }
     @Override
     public void draw()
     {
         System.out.println("Drawing Circle");
     }
}