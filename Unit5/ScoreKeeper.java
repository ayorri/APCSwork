public class ScoreKeeper
{
  public void ScoreKeepeer(int score)
  {
    score = 0;
  }
  public void scoreNormal()
  {
    score += 100;
  }
  public void scoreBonus()
  {
    score += 1000;
  }
  public double total()
  {
    return score;
  }
  private double score;
}
