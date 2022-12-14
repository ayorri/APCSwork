import java.util.Arrays;

public class TotalZ
{
  public static double totalz(String[] name)
  {
    double count = 0;
    for(int i=0; i<name.length; i++)
    {
      if (name[i].substring(0,1).equals("z") || name[i].substring(0,1).equals("Z"))
      {
        count++;
      }
    }
    return count;
  }
  public static void testTotalZ(String[] name, double e)
  {
    double result = totalz(name);
    for(int i=0; i<name.length; i++)
    {
      System.out.println("Word/Name: " + name[i]);
    }
      System.out.println("Expected: " + e + " Result: " + result);

      if(result == e)
        System.out.println("GOT IT!");
      else
        System.out.println("WRONG!");

      System.out.println();
  }
  public static void main(String[] args)
  {
    String[] name = {"Dr. Kessner", "Dr. Sands"};
    String[] name2 = {"Zoro", "zero", "Zippy"};
    String[] name3 = {"zeref", "Zeus", "juice"};


    testTotalZ(name, 0);
    testTotalZ(name2, 3);
    testTotalZ(name3, 2);
  }
}
