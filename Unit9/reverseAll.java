import java.util.ArrayList;

public class reverseAll
{
  public static ArrayList<String> Reverse(ArrayList<String> words)
  {
    ArrayList<String> result = new ArrayList<String>();
    for(String word : words)
    {
      String nothing = "";
      for(int i = word.length(); i > 0; i--)
      {
        nothing += word.substring(i-1,i);
      }
      result.add(nothing);
    }
    return result;
  }
  public static void main(String[] args)
  {
    ArrayList<String> words = new ArrayList<String>();
    words.add("abcd");
    words.add("xyz");
    words.add("1234");
    words.add("racecar");

    System.out.println("reversed: " + Reverse(words));
  }
}
