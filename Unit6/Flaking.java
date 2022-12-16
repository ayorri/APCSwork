import processing.core.*;
import java.util.*;

public class Flaking extends PApplet
{
  public void settings()
  {
    size(400,400);
  }
  public void setup()
  {
    flake = new ArrayList<Snowflakes>();
    createSnowflake();
  }
  public void createSnowflake()
  {
    float x = mouseX;
    float y = mouseY;
    float w = random(5,20);
    int color = color(random(256), random(256), random(256));
    Snowflakes f = new Snowflakes(this, x, y, w,color);
    flake.add(f);
  }
  public void draw(){
    background(0);
    for(Snowflakes f: flake){
      f.display();
  }
}
public void keyPressed()
{
  for(int i = 0; i < 10; i++)
  {
    createSnowflake();
  }
}
  public static void main(String[] args)
  {
    PApplet.main("Flaking");
  }
  private ArrayList<Snowflakes> flake;
}
