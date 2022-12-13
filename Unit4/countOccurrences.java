public class countOccurrences
{
  public static void testcountOccurrences(String word,
  String repeated, int expected)
  {
    int result = countOccurrences(word, repeated);

    System.out.println("Word: " + word + " Repeated: " + repeated +
    " Occurrences?: " + result);

    if (result == expected)
      System.out.println("YES YES!");
    else
      System.out.println("NO NO!");
  }

  public static int countOccurrences(String word, String repeated)
  {
    int count = 0;
    for (int i=0; i<=word.length()-repeated.length(); i++)
    {
      if(word.substring(i,i+repeated.length()).equals(repeated))
      {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args)
  {
    testcountOccurrences("Mississippi", "iss", 2);
    testcountOccurrences("banananana", "na", 4);
    testcountOccurrences("Serendipity", "Intro", 0);
    testcountOccurrences("Go big or Go home", "Go", 2);
    testcountOccurrences("Shalalala", "la", 3);
  }

}
