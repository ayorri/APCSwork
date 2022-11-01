public class Greetings
{
  public static void testGreetings(String str)
  {
    String result = Greetings(str);

    System.out.println("Name: " + str + " Expected: Hello " + str + ", how are you? "
     + "Result: " + result);
  }
  public static String Greetings(String str)
  {
    return "Hello " + str + ", how are you?";
  }

  public static void main(String[] args)
  {
    testGreetings("Allie");
    testGreetings("Chloe");
    testGreetings("Jay");
  }
}
