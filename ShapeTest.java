public class ShapeTest
{
  
  public static void main(String[] args)
  {
    Shape c = new Circle(5.0);
    Shape r = new Rectangle(2,3);
    Shape s = new Square(4);
    System.out.println(c.toString() + " "+ c.getArea());
    System.out.println(r.toString() + " "+ r.getArea());
     System.out.println(s.toString() +" "+ s.getArea());
     Circle cc = (Circle) c; /*Correct*/
     //Circle c2 = c; /*compile error*/
     cc.draw();
     Rectangle rr = (Rectangle)r;
     rr.draw();
    // r.getPerimeter(); /*Compile error*/
     Square ss = (Square)s;
     ss.draw();
     
     
  }
}

 interface Drawable
{
    public default void draw()
    {
        System.out.println("default draw");
    }
}

 abstract class Shape 
{
  protected double area;
  public abstract double getArea();
  
  
}

 class Circle extends Shape implements Drawable
{
  private double radius;
  public Circle(double r)
  {
    if(r >0)
    this.radius = r;
    else throw new IllegalArgumentException("Radus must be > 0");
  }
  
  @Override
  public  double getArea()
  {
    this.area = 3.14*radius*radius;
    return this.area;
  }
  
  @Override
  public String toString()
  {
    return super.toString();      
  }
  
  @Override
  public  void draw()
    {
        System.out.println("draw the Circle");
    }
}

 class Rectangle extends Shape implements Drawable
{
  protected double a;
  protected double b;
  
  protected double perimeter;
  
  public Rectangle(double a, double b)
  {
    if(a >0 && b >0){
    	this.a = a;
      	this.b = b;
    }
    else throw new IllegalArgumentException("Arguments must be > 0");
  }
  
  @Override
  public  double getArea()
  {
    this.area = a*b;
    return this.area;
  }
  
  public double getPerimeter()
  {
    this.perimeter = 2*(a+b);
    return this.perimeter;
  }
  
  @Override
  public String toString()
  {
    return super.toString();      
  }
  
  @Override
  public  void draw()
    {
        System.out.println("draw the Rectangle");
    }
}


 class Square extends Rectangle implements Drawable{
	
  public Square(double a)
  {
    super(a,a);
  }
  
  @Override
  public String toString()
  {
    return super.toString();      
  }
  
  @Override
  public  void draw()
    {
        System.out.println("draw the Square");
    }
}

