public class MagicEightBall
{
  public String ask()
  {
    if (Math.random() < 0.25)
      return "Yes";
    else if (Math.random() < 0.5 && Math.random() > 0.25)
      return "Somewhat";
    else if (Math.random() < 0.75 && Math.random() > 0.5)
      return "Maybe";
    else
      return "No";
  }
  private String ask;
}
