public class Attention
{
  public static void testAttention(String str, boolean expected)
  {
    boolean result = attention(str);

    System.out.println("Sentence: " + str + " expected: "
    + expected + " result: " + result);

    if (result == expected)
    {
      System.out.println("YAY");
    }else{
      System.out.println("BOO");
    }
  }

  public static boolean attention(String str)
  {
    String intro = str.substring(0,8);

    return intro.equals("Hey you!");
  }

  public static void main(String[] args)
  {
    testAttention("What are you doing Chloe?", false);
    testAttention("Hey you! Get over here!", true);
    testAttention("Ayo, hitman bang introducing!", false);
  }
}
