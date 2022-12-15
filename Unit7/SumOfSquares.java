import java.util.Arrays;

public class SumOfSquares
{
  public static void testsumOfSquares(double[] nums, double e)
  {
    double result = sumOfsquares(nums);
    for(double num : nums)
    {
      System.out.println("Number: " + num);
    }
      System.out.println("Expected: " + e + " Result: " + result);

    if(result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");

    System.out.println();
  }
  public static double sumOfsquares(double[] nums)
  {
    double sum = 0;

    for(double num : nums)
      sum += num*num;

    return sum;
  }
  public static void main(String[] args)
  {
    double[] nums = {0};
    double[] nums2 = {1.0, 2.0, 3.0};
    double[] nums3 = {2.0, 2.0, 2.0};

    testsumOfSquares(nums, 0);
    testsumOfSquares(nums2, 14.0);
    testsumOfSquares(nums3, 12.0);
  }
}
