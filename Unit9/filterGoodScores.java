import java.util.ArrayList;

public class filterGoodScores
{
  public static void testgoodScore(ArrayList<Integer> score)
  {
    ArrayList<Integer> outcome = filterGoodScores(score);

    System.out.println("numbers: " + score);
    System.out.println("Result: " + outcome);

    System.out.println();
  }
  public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> score)
  {
    ArrayList<Integer> result = new ArrayList<Integer> ();

    for(int i=0; i<score.size(); i++)
    {
      if(score.get(i) > 90)
      result.add(score.get(i));
    }
    return result;
  }
  public static void main(String[] args)
  {
    ArrayList<Integer> score = new ArrayList<Integer>();
    score.add(51);
    score.add(52);
    score.add(53);
    score.add(100);
    ArrayList<Integer> score2 = new ArrayList<Integer>();
    score2.add(92);
    score2.add(89);
    score2.add(90);
    score2.add(99);

    testgoodScore(score);
    testgoodScore(score2);
  }
}
