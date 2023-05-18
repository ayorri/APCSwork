public class plusTen
{
  public static void main(String[] args)
  {
    int n = 5;
    double[][] cells = new double[n][n];

    //plus ten array
    for (int i=0; i<n; i++)
    {
      for (int j=0; j<n; j++)
      {
        //combine i and j into one number
          //convert i and j into strings
          //String.valueOf(integer value)
        String a = String.valueOf(i+1);
        String b = String.valueOf(j+1);
          //add i and j together
        //convert i and j into a double
        cells[i][j] = Double.valueOf(a+b);
      }
    }

    System.out.println("cells:");

    for (double[] row : cells)
    {
      for (double value : row)
      {
         System.out.print(value + " ");
      }
      System.out.println();
    }

    System.out.println();
    
    //consecutive array
    int[][] consecutive = new int[6][5];

    for(int r=0; r<consecutive.length; r++)
    {
      for(int c=0; c<consecutive[0].length; c++)
      {
        consecutive[r][c] = r+1;
      }
    }

    for (int[] row : consecutive)
    {
      for(int value: row)
      {
        System.out.print(value + " ");
      }
      System.out.println();
    }

  }
}
