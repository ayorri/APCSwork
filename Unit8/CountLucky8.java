import java.util.ArrayList;

public class CountLucky8
{
  public static void testCountLucky(ArrayList<Integer> numbers, int e)
  {
    int result = countLucky(numbers);
    System.out.println("numbers: " + numbers);
    System.out.println("Expected: " + e + " Result: " + result
      + " How many lucky numbers?: " + result);

    if(result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");
  }
  public static int countLucky(ArrayList<Integer> numbers)
  {
    int count = 0;
    for (int i=0; i<numbers.size(); i++)
    {
      if(numbers.get(i) == 7 || numbers.get(i)%10 == 7)
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args)
  {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    testCountLucky(numbers, 0);
  }
}
