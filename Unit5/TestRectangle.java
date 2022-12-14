public class TestRectangle
{
  public static void testRectangle(Rectangle r, double expectedArea, double expectedPerimeter,
  double expectedDiagonal)
  {
    double resultArea = r.area();
    double resultPerimeter = r.perimeter();
    double resultDiagonal = r.diagonal();

    System.out.println("length: " + r.getLength() + " width: " + r.getWidth() +
    " expected area:  " + expectedArea + " resulting area: " + resultArea +
    " expected perimeter:  " + expectedPerimeter + " resulting perimeter: " + resultPerimeter +
    " expected diagonal:  " + expectedDiagonal + " resulting diagonal: " + resultDiagonal);

  }
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(4, 3);
    System.out.println("length: " + r1.getLength());
    System.out.println("width: " + r1.getWidth());
    System.out.println("area: " + r1.area());
    System.out.println("perimeter: " + r1.perimeter());
    System.out.println("diagonal: " + r1.diagonal());

    Rectangle r2 = new Rectangle(5, 12);

    testRectangle(r1, 12, 14, 5);
    testRectangle(r2, 60, 34, 13);
  }
}
