public class coinFlip
{
  public static void main(String[] args)
  {
    for(int i = 0; i < 20; i ++)
    {
      if (Math.random() < 0.5)
      {
        System.out.println("Heads");
      }else{
        System.out.println("Tails");
      }
    }
  }

}
