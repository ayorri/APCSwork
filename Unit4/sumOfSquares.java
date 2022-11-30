public class sumOfSquares
{
  public static void testsumOfSquares(int n, int e)
  {
    int result = sumOfSquares(n);

    System.out.println("Number: " + n + " Expected: " + e + " Result: " + result);

    if(result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");
  }

  public static int sumOfSquares(int n)
  {
    int result = 0;
    for (int i = 1; i <= n; i++)
    {
      result += i*i;
    }
    return result;
  }

  public static void main(String[] args)
  {
    testsumOfSquares(1, 1);
    testsumOfSquares(2, 5);
    testsumOfSquares(3, 14);
    testsumOfSquares(4, 30);
    testsumOfSquares(5, 55);
  }

}
