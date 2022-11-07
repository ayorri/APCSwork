public class startHi
{
  public static void testStartHi(String str, boolean expected)
  {
    boolean result = startHi(str);

    System.out.println("Phrase: " + str + "; expected: " + expected + "; result: "
    + result);

    if (result == expected)
    {
      System.out.println("WHOOPEE");
    }else{
      System.out.println("AWWW MANNN");
    }
  }

  public static boolean startHi(String str)
  {
    if (str.length() < 2)
    {
      return false;
    }

    String FirstTwo = str.substring(0,2);

    return FirstTwo.equals("hi");
  }

  public static void main(String [] args)
  {
    testStartHi("Heyooo bestie", false);
    testStartHi("OMG IT'S BTS", false);
    testStartHi("hi mom", true);
  }

}
