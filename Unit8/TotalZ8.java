import java.util.ArrayList;

public class TotalZ8
{
  public static void testTotalZ(ArrayList<String> name, double e)
  {
    double result = totalz(name);
    System.out.println("Word/Name: " + name);
    System.out.println("Expected: " + e + " Result: " + result);

      if(result == e)
        System.out.println("GOT IT!");
      else
        System.out.println("WRONG!");

      System.out.println();
  }
  public static double totalz(ArrayList<String> name)
  {
    double count = 0;
    for(int i=0; i<name.size(); i++)
    {
      if (name.get(i).substring(0,1).equals("z") ||
       name.get(i).substring(0,1).equals("Z"))
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args)
  {
    ArrayList<String> name = new ArrayList<String>();
    name.add("Dr. Kessner");
    name.add("Dr. Sands");
    ArrayList<String> name2 = new ArrayList<String>();
    name2.add("Zoro");
    name2.add("zero");
    name2.add("Zippy");
    ArrayList<String> name3 = new ArrayList<String>();
    name3.add("zeref");
    name3.add("Zera");
    name3.add("Mavis");

    testTotalZ(name, 0);
    testTotalZ(name2, 3);
    testTotalZ(name3, 2);
  }
}
