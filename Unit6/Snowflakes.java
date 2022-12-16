// WHEN HOLDING DOWN ANY KEY, CIRCLE CHANES COLORS/NEW CIRCLE APPEARS

import processing.core.*;

public class Snowflakes
{
  public Snowflakes(PApplet p, float x, float y, float w, int color)
  {
    this.p = p;
    this.x = x;
    this.y = y;
    this.w = w;
    this.color = color;
  }
  public void display()
  {
    p.fill(color);
    p.ellipse(x,y,w*5,w*5);


  }
  private PApplet p;
  private float x;
  private float y;
  private float w;
  private int color;

}
