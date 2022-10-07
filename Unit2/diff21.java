public class diff21
{
  public static void testDiff21(int n, int expected)
  {
    int result = diff21(n);
    boolean doubleanswer = n > 21;

    System.out.println("n = " + n + " Double?: " + doubleanswer + " expected: " + expected
    + " result: " + result);

    if(result == expected)
    {
      System.out.println("YAYYYY CORRECT");
    }else{
      System.out.println("NOOOO WRONG EXPECTATION");
    }
  }

  public static int diff21(int n)
  {
      if (n <= 21) {
        return 21 - n;
      } else {
      return (n - 21) * 2;
    }
  }

  public static void main(String[] args)
  {
    testDiff21(13, 8);
    testDiff21(38, 5);
    testDiff21(41, 40);
  }
}
