import java.util.ArrayList;

public class fibonacci
{
  public static void testFibonacci(int n)
  {
    ArrayList<Integer> outcome = fibonacci(n);

    System.out.println("numbers: " + n);
    System.out.println("Result: " + outcome);

    System.out.println();
  }
  public static ArrayList<Integer> fibonacci(int n)
  {
    ArrayList<Integer> result = new ArrayList<Integer> ();
    int a = 0, b = 1, c;
    result.add(a);
    result.add(b);
    for(int i = 2; i < n; i++)
    {
      c = a+b;
      a = b;
      b = c;
      result.add(c);
    }

      return result;
  }
  public static void main(String[] args)
  {
    testFibonacci(2);
    testFibonacci(3);
    testFibonacci(4);
    testFibonacci(5);

  }
}
