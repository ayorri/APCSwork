import processing.core.*;

public class Snake
{
  public Snake(PApplet p, String gameState, PVector position,
  int dx, int dy, float radius)
  {
    this.p = p;
    this.gameState = gameState;
    this.velocity = velocity;
    this.position = position;
    this.dx = dx;
    this.dy = dy;
    this.radius = radius;
  }
  public void display()
  {
    p.fill(50, 168, 82);
    p.ellipse(position.x, position.y, radius *2, radius*2);
  }
  private PApplet p;
  private String gameState;
  private PVector position;
  private float radius;
  private int dx;
  private int dy;
}
