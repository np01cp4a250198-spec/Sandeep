package Week11;
public class Main
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Circle(7);
        for (Shape shape : shapes)
        {
            shape.displayShapeInfo();
            ((Drawable) shape).draw();
            
        }
    }
}