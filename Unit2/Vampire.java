public class Vampire
{
  public static void testisVampire(float hour, boolean awake, boolean expected)
  {
    boolean result = isVampire(hour, awake);
    System.out.println("hour: " + hour + "; awake?: " + awake +
    "; expected: " + expected + "; result: " + result);

    if (result == true)
    {
      System.out.println("A VAMPIRE!");
    }else{
      System.out.println("Phew, not a vampire.");
    }
  }
  public static boolean isVampire(float hour, boolean awake)
  {
    //return awake && (hour > 6 && hour < 22);
   if ((hour > 6 || hour < 22) && awake == false || (hour < 6 || hour > 22) && awake == true)
    {
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args)
  {
    testisVampire(8, false, true);
    testisVampire(13, true, false);
    testisVampire(23, true, true);
  }
}
