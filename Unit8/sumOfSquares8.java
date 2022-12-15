import java.util.ArrayList;

public class sumOfSquares8
{
  public static void testsumOfSquares(ArrayList<Double> nums, double e)
  {
    double result = sumOfsquares(nums);
    System.out.println("Number: " + nums);
    System.out.println("Expected: " + e + " Result: " + result);

    if(result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");

    System.out.println();
  }
  public static double sumOfsquares(ArrayList<Double> nums)
  {
    double sum = 0;

    for(double num : nums)
      sum += num*num;

    return sum;
  }
  public static void main(String[] args)
  {
    ArrayList<Double> nums = new ArrayList<Double>();
    nums.add(0.0);
    ArrayList<Double> nums2 = new ArrayList<Double>();
    nums2.add(1.0);
    nums2.add(2.0);
    nums2.add(3.0);
    ArrayList<Double> nums3 = new ArrayList<Double>();
    nums3.add(2.0);
    nums3.add(2.0);
    nums3.add(2.0);

    testsumOfSquares(nums, 0);
    testsumOfSquares(nums2, 14.0);
    testsumOfSquares(nums3, 12.0);
  }
}
