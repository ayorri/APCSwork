public class backAround
{
  public static void testBackAround(String str, String expected)
  {
    String result = backAround(str);

    System.out.print("Word: " + str + "; expected: " + expected +
    "; result: " + result);

    if (result.equals(expected))
      System.out.println(" YIP YIP");
    else
      System.out.println(" aww man");
  }

  public static String backAround(String str)
  {
    String last = str.substring(str.length() - 1);

    return last + str + last;
  }

  public static void main (String[] args)
  {
    testBackAround("racecar", "rracecarr");
    testBackAround("Allie", "eAlliee");
    testBackAround("cupcake", "ecupcakee");
  }
}
