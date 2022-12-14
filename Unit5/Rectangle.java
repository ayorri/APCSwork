public class Rectangle
{
  public Rectangle(double lengthIn, double widthIn)
  {
    length = lengthIn;
    width = widthIn;
  }
  public double getLength()
  {
    return length;
  }
  public double getWidth()
  {
    return width;
  }
  public double area()
  {
    return length * width;
  }
  public double perimeter()
  {
    return (2 * length) + (2 * width);
  }
  public double diagonal()
  {
    return Math.sqrt((length * length) + (width * width));
  }
  private double length;
  private double width;
}
