public class frontTimes
{
  public static void testFrontTimes(String str, int n, String expected)
  {
    String result = frontTimes(str, n);

    System.out.println("Word: " + str + " # of repetitions: " + n
    + " expected: " + expected + " result: " + result);

    if (result.equals(expected))
      System.out.println("Yayy");
    else
      System.out.println("Nooo");
  }

  public static String frontTimes(String str, int n)
  {
  int firstThree = 3;
  if (firstThree > str.length())
  {
    firstThree = str.length();
  }
  String first = str.substring(0, firstThree);

  String result = "";
  for (int i=0; i<n; i++)
  {
    result = result + first;
  }
  return result;

  }

  public static void main(String[] args)
  {
    testFrontTimes("Allie" , 5, "AllAllAllAllAll");
    testFrontTimes("Chloe" , 2, "ChlChl");
    testFrontTimes("NewJeans", 4, "NewNewNewNew");
  }
}
