public class SumOfEvens
{
  public static void testsumOfEvens(int n, int e)
  {
    int result = SumOfEvens(n);

    System.out.println("Number: " + n + " Expected: " + e + " Result: " + result);

    if(result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");
  }

  public static int SumOfEvens(int n)
  {
    int count = 0;
    for (int i = 0; i < n;i++)
    {
      if(i % 2 == 0)
      count += i;
    }
    return count;
  }

  public static void main(String[] args)
  {
    testsumOfEvens(0,0);
    testsumOfEvens(1,2);
    testsumOfEvens(2,6);
    testsumOfEvens(3,12);
    testsumOfEvens(4,20);
  }

}
