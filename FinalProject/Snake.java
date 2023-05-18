import processing.core.*;
import java.util.*;

public class Snake
{
  public Snake(PApplet p, String gameState, PVector position, PVector velocity,
  /*int dx, int dy,*/ float radius)
  {
    this.p = p;
    this.gameState = gameState;
    this.velocity = velocity;
    this.position = position;
    //this.dx = dx;
    //this.dy = dy;
    this.radius = radius;
  }
  public void display()
  {
    p.fill(50, 168, 82);
    p.ellipse(position.x, position.y, radius *2, radius*2);

    position.add(velocity);

    if ((position.x > p.width) || (position.x < 0)) {
      velocity.x = velocity.x * -1;
    }
    if ((position.y > p.height) || (position.y < 0)) {
      velocity.y = velocity.y * -1;
    }
  }
  private PApplet p;
  private String gameState;
  private PVector position;
  private PVector velocity;
  private float radius;
  //private int dx;
  //private int dy;
}
