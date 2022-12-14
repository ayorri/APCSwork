public class TestMagicEightBall
{
  public static void main(String[] args)
  {
    MagicEightBall ball = new MagicEightBall();
    MagicEightBall ball2 = new MagicEightBall();
    MagicEightBall ball3 = new MagicEightBall();

    ball.ask();
    ball2.ask();
    ball3.ask();

    System.out.println("Will I become rich? " + ball.ask());
    System.out.println("Will I ace my test tomorrow? " + ball2.ask());
    System.out.println("Am I going to get Juniors this weekend? " + ball3.ask());
   }
}
