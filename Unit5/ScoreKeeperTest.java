public class ScoreKeeperTest
{
  public static void main(String[] args)
  {
    ScoreKeeper score = new ScoreKeeper();

    score.scoreNormal();
    score.scoreNormal();
    score.scoreBonus();
    score.scoreNormal();
    score.scoreBonus();
    
    System.out.println("Score total: " + score.total());
  }
}
