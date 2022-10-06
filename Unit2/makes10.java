public class makes10
{
  public static void testmakes10(int a, int b, boolean ten)
  {
    boolean result = makes10(a, b);

    System.out.println("a = " + a + "; b = " + b + "; a+b = : " + (a+b) +
    "; has 10 or equals 10? " + ten + "; result -> " + result);

    if (result == ten)
    {
      System.out.println("YAYYY CORRECT RESULT!");
    }else{
      System.out.println("Hmmmmmm so a or b DOES equal 10 or add to equal 10");
    }
  }

  public static boolean makes10(int a, int b)
  {
    return (a == 10 || b == 10 || a + b == 10);
  }

  public static void main(String[] args)
  {
    testmakes10(7, 8, false);
    testmakes10(3, 10, false);
    testmakes10(9, 1, true);
  }
}
