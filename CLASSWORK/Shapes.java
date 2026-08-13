import java.util.*;

class Shape
{
    void area()
    {
        System.out.println("Area of shape");
    }

    void area(int a)
    {
        System.out.println("Area of square: " + (a * a));
    }

    void area(int l, int b)
    {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    void area(float r)
    {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    void area(float b, float h)
    {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

public class Shapes
{
    public static void main(String args[])
    {
        Shape s = new Shape();

        s.area();
        s.area(5);
        s.area(5, 10);
        s.area(2.5f);
        s.area(5.0f, 10.0f);
    }
}