public class Vampire
{
  public static void testisVampire(float hour, boolean awake)
  {
    boolean vampire = isVampire(hour, awake);

    if (vampire == true)
    {
      System.out.println("A VAMPIRE!");
    }else{
      System.out.println("Phew, not a vampire.");
    }
  }
  public static boolean isVampire(float hour, boolean awake)
  {
    if (hour > 6 && hour < 22 && awake == false)
    {
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args)
  {
    testisVampire(8, false);
    testisVampire(13,true);
    testisVampire(2, false);
  }
}
