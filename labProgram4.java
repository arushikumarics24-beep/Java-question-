/*Develop a Java program to create an abstract class named
Shape that contains two integers and an empty method
named printArea(). Provide three classes named
Rectangle, Triangle and Circle such that each one of the
classes extends the class Shape. Each one of the classes
contain only the method printArea() that prints the area of
the given shape.*/
abstract class Shape{
    int a,b;
    Shape(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    abstract void printArea();
}
class Rectangle extends Shape{

    public Rectangle(int l,int b) {
        super(l,b);
    }
    void printArea()
    {
        double area=a*b;
        System.out.println("THE AREA IS: "+area);
    }

}
class TRIANGLE extends Shape{
    public TRIANGLE(int b,int h) {
        super(b,h);
    }
    void printArea()
    {
        double area=0.5*a*b;
        System.out.println("THE AREA IS: "+area);
    }
}
class Circle extends Shape
{
    public Circle(int r) 
    {
        super(r,0);
    }
    void printArea()
    {
        double area=Math.PI*a*a;
        System.out.println("THE AREA IS: "+area);
    }
}
public class labProgram4
{ 
    public static void main(String args[])
    {
        TRIANGLE t=new TRIANGLE(12,6);
        Circle c=new Circle(7);
        Rectangle r=new Rectangle(12, 6);
        t.printArea();
        r.printArea();
        c.printArea();
    }
}