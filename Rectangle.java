public class Rectangle{
double area, length, breadth;
Rectangle(double length, double breadth){
this.length =length;
this.breadth = breadth;}



public double getArea()
{
return length*breadth;
}
public double getPerimeter()
{
 return 2*(length+breadth);
}
public static void main(String[] args)
{
Rectangle rc = new Rectangle(4.5,6.8);
double a = rc.getArea();
double p = rc.getPerimeter();
System.out.println("Area of rectangle "+ a);
System.out.println("Perimeter of rectangle " + p);
}
}
