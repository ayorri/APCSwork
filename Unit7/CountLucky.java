import java.util.Arrays;

public class CountLucky
{
  public static int countLucky(int[] nums)
  {
    int count = 0;
    for (int i=0; i<nums.length; i++)
    {
      if(nums[i] == 7 || nums[i]%10 == 7)
      {
        count++;
      }
    }
    return count;
  }
  public static void testCountLucky(int[] nums, int expected)
  {
    int result = countLucky(nums);
    for (int num : nums)
    {
      System.out.println("Numbers " + num);
    }

    System.out.println("expected: " +
    expected + " result: " + result);

    if(result == expected)
      System.out.println("LET'S GOOOO");
    else
      System.out.println("WRONGGGG");

    System.out.println();
  }
  public static void main(String[] args)
  {
    int[] nums = {1,2,3};
    int[] nums2 = {7,12,17};
    int[] nums3 = {107,207};

    testCountLucky(nums, 0);
    testCountLucky(nums2, 2);
    testCountLucky(nums3, 2);
  }
}
