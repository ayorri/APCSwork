public class computations2D
{
  public static double Sum(int[][] list)
  {
    double sum = 0;
    for(int[] arr : list)
    {
      for(int value : arr)
      {
      sum += value;
      }
    }
    return sum;
  }

  public static int countA(String[][] words)
  {
    int count = 0;
    for(String[] arr: words)
    {
      for(String w : arr)
      {
        if (w.substring(0,1).equals("A") || w.substring(0,1).equals("a"))
        {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args)
  {
    //words array
    String[][] words =
    {
      {"Apple", "Bottom", "Jeans"},
      {"Rachael", "Allie", "Chloe"}
    };
    //smallest number array
    int[][] list = { {105, 208, 219}, {103, 215, 203}};
    int least = list[0][0];

    for(int i=0; i<list.length; i++)
    {
      for(int j=0; j<list[i].length; j++)
      {
        if(list[i][j] < least)
        {
          least = list[i][j];
        }
      }
    }
    //smallest #
    System.out.println("The smallest number in the list: ");
    System.out.println(least);
    //sum of list
    System.out.println("The sum of the list: ");
    System.out.println(Sum(list));
    //words that start with a
    System.out.println("Words that start with \"A\" in the list");
    System.out.println(countA(words));
  }
}
