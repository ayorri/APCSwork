public class arrayInitial
{
  public static void main(String[] args)
  {
    int n = 10;
    int[][] cells = new int[n][n];

    for (int i=0; i<n; i++)
    {
      for (int j=0; j<n; j++)
      {
         if(i==j)
         {
           cells[i][j] = 1;
         }else{
           cells[i][j] = 0;
         }
      }
    }

    System.out.println("cells:");

    for (int[] row : cells)
    {
      for (int value : row)
      {
         System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}
