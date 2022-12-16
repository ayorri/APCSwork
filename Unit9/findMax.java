import java.util.ArrayList;

public class findMax
{
  public static void testFindmax(ArrayList<Double> nums, double e)
  {
    double result = findMax(nums);
    System.out.println("numbers: " + nums);
    System.out.println("Expected: " + e + " Result: " + result
      + " Maximum Number?: " + result);

    if(result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");

    System.out.println();
  }
  public static double findMax(ArrayList<Double> nums)
  {
    Double maximum = nums.get(0);

    for(int i=0; i<nums.size(); i++)
    {
      if(maximum > nums.get(i));
      maximum = nums.get(i);
    }
    return maximum;
  }
  public static void main(String[] args)
  {
    ArrayList<Double> nums = new ArrayList<Double>();
    nums.add(1.0);
    nums.add(2.1);
    nums.add(5.3);
    ArrayList<Double> nums2 = new ArrayList<Double>();
    nums2.add(0.0);
    nums2.add(-35.0);
    nums2.add(90.1);

    testFindmax(nums, 5.3);
    testFindmax(nums2, 90.1);
  }
}
