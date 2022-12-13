public class reverse
{
  public static void testReverse(String word, String expected)
  {
    String result = reverse(word);

    System.out.println("Word: " + word + " Expected: " + expected + " Result: " + result);

    if (result.equals(expected))
      System.out.println("GLORIOUSSSS");
    else
      System.out.println("WaH WaH");
  }

  public static String reverse(String word)
  {
    String result = "";
    for(int i=word.length()-1; i>= 0; i--)
    {
      result = result + word.charAt(i);
    }
    return result;
  }

  public static void main(String[] args)
  {
    testReverse("bad", "dab");
    testReverse("Hello, world!", "!dlrow ,olleH");
    testReverse("tacocat", "tacocat");
    testReverse("Lincoln", "nlocniL");
    testReverse("LE SSERAFIM", "MIFARESS EL");
    testReverse("sour grapes", "separg ruos");
  }
}
