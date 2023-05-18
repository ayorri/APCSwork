import processing.core.*;
import java.util.*;


public class Game extends PApplet
{
    public void settings()
    {
        size(480, 580);
    }

    public void setup()
    {
        //Pvector position = new PVector(60,60);
        scenes = new ArrayList<Scene>();
        scenes.add(new StartScene(this));
        scenes.add(new Rules(this));
        scenes.add(new GameScene(this));
        scenes.add(new EndScene(this));
    }

    public void draw()
    {
        scenes.get(current).display();
    }

    public void keyPressed()
    {
        if (keyCode == ENTER)
        {
            current++;
            if (current >= scenes.size())
                current = 0;
        }
        scenes.get(current).handleKeyPressed();
    }

    /*public void checkEdges()
    {
      {
      if (position.x > width || position.x < 0)
      current++;
      if (current >= scenes.size())
          current = 1;
      }
      scenes.get(current).handleCheckEdges();
    }*/

    private ArrayList<Scene> scenes;
    private int current = 0;

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}
