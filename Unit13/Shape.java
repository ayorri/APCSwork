public class Shape
{
  public Shape(String shapeName, int sides)
  {
    this.sides = sides;
    this.shapeName = shapeName;
  }

  public String getName()
  {
    return shapeName;
  }

  public int getSides()
  {
    return sides;
  }

  public String toString()
  {
    return shapeName + " " + sides;
  }

  private int sides;
  private String shapeName;

}
