import java.util.*;
public class shapeCollection
{
  public shapeCollection()
  {
    shapes = new ArrayList<Shape>();
  }

  public void addShape(String shapeName, int sides)
  {
    Shape shape = new Shape(shapeName, sides);
    shapes.add(shape);
  }

  public void numberOfSides()
  {
    for(Shape s : shapes)
      System.out.println(s.getName() + ": " + s.getSides());
  }

  public int avgSides()
  {
    int count = 0;
    for(Shape s : shapes)
    {
      count += s.getSides();
    }
    return count / shapes.size();
  }

  public ArrayList<Shape> getEven()
  {
    ArrayList<Shape> even = new ArrayList<Shape>();
    for(Shape s : shapes)
    {
      if(s.getSides() % 2 == 0)
      {
        even.add(s);
      }
    }
    return even;
  }

  private ArrayList<Shape> shapes;

  public static void main(String[] args)
  {
    shapeCollection figure = new shapeCollection();

    figure.addShape("Triangle", 3);
    figure.addShape("Square", 4);
    figure.addShape("Pentagon", 5);
    figure.addShape("Hexagon", 6);
    figure.addShape("Heptagon", 7);
    figure.addShape("Octagon", 8);

    System.out.println("Average # of sides: " + figure.avgSides());
    System.out.println("Shapes with even # of sides: " + figure.getEven());
  }
}
