public class doubleX
{
  public static void testDoubleX(String str, boolean expected)
  {
    boolean result = doubleX(str);

    System.out.println("Word: " + str + " Expected " + expected +
    " Result: " + result);

    if (result == expected)
      System.out.println("Woot Woot");
    else
      System.out.println("What the");
  }

  public static boolean doubleX(String str)
  {
    int i = str.indexOf("x");
    if (i == -1)
      return false;

    if (i+1 >= str.length())
    return false;

    return str.substring(i+1, i+2).equals("x");
  }

  public static void main(String[] args)
  {
    testDoubleX("xylophone", false);
    testDoubleX("xxoxx", true);
    testDoubleX("xALLIEx", false);
  }
}
