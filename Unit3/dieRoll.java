public class dieRoll
{
  public static void main(String[] args)
  {
    int min = 1;
    int max = 6;
    for (int i = 0; i < 20; i++)
    {
      int randomNumber = (int)(Math.random()*(max - min + 1) + min);
      System.out.println(randomNumber);
    }
  }

}
