public class Rectangle{
  public Rectangle(int l, int w)
  {
    this.l = l;
    this.w = w;
  }

  public int perimeter()
  {
    return 2*l + 2*w;
  }

  public int area()
  {
    return l*w;
  }

  public static int avgPeri(Rectangle[][] rects)
  {
    int total = 0;
    int count = 0;
    for(Rectangle[] r : rects)
      for(Rectangle peri : r)
      {
        total += peri.perimeter();
        count++;
      }
    return total / count;
  }

  public static int greatestArea(Rectangle[][] rects)
  {
    int greatest = 0;
    for(Rectangle[] r : rects)
      for(Rectangle area : r)
      {
        if(area.area() > greatest)
        {
          greatest = area.area();
        }
      }
    return greatest;
  }

  public static void main(String[] args)
  {
    Rectangle[][] rects = new Rectangle[2][2];

    Rectangle rect1 = new Rectangle(1,2);
    Rectangle rect2 = new Rectangle(5,3);
    Rectangle rect3 = new Rectangle(4,7);
    Rectangle rect4 = new Rectangle(8,6);

    rects[0][0] = rect1;
    rects[0][1] = rect2;
    rects[1][0] = rect3;
    rects[1][1] = rect4;

    System.out.println("Average Perimeter of all Rectangles: ");
    System.out.println(avgPeri(rects));

    System.out.println("The greatest area of all Rectangles: ");
    System.out.println(greatestArea(rects));
  }

  private int l;
  private int w;
}
