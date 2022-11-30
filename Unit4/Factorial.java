public class Factorial
{
  public static void testfactorial(int n, int e)
  {
    int result = Factorial(n);

    System.out.println("Number: " + n + " Expected: " + e + " Result: " + result);

    if (result == e)
      System.out.println("AWESOME!");
    else
      System.out.println("NOT AWESOME!");
  }

  public static int Factorial(int n)
  {
    int result = 1;
    for(int i=1; i<=n; i++)
    {
      result = result*i;
    }
    return result;
  }

  public static void main (String[] args)
  {
    testfactorial(0, 1);
    testfactorial(1, 1);
    testfactorial(2, 2);
    testfactorial(3, 6);
    testfactorial(4, 24);
    testfactorial(5, 120);
    testfactorial(6, 720);
    testfactorial(7, 5040);
  }

}
