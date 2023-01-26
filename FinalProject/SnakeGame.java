import processing.core.*;
import java.util.*;

public class SnakeGame extends PApplet
{
  int dx, dy;
  String gameState = "START";
  public void settings(){
    size(800,800);
  }
  public void setup()
  {
    textAlign(CENTER);
    dx = width/2;
    dy = height/2;
  }
  public void draw()
  {
    background(0);

    if(gameState == "START"){
      drawStart();
    }else if(gameState == "GAME"){
      drawGame();
    }else{
      drawEnd();
    }

  }
  public void keyPressed(){
    if(gameState == "START"){
      gameState = "GAME";
    }else if(gameState == "GAME"){
      if(keyCode == UP){
        dy -= 10;
      }else if(keyCode == DOWN){
        dy += 10;
      }else if(keyCode == RIGHT){
        dx = dx + 10;
      }else if(keyCode == LEFT){
        dx = dx - 10;
      }
  }
}
  public void drawStart(){
    text("SNAKE", width/2, height/2);
    text("Move the arrow keys to eat the fruit!", width/2, height/2+25);
    text("Press any key to start", width/2, height/2+50);
  }
  public void drawGame(){
    ellipse(dx, dy, 50,50);
  }
  public void drawEnd(){
    text("Score:", width/2, height/2);
    text("Press any key to start again", width/2, height/2);
  }
  public static void main(String[] args)
  {
    PApplet.main("SnakeGame");
  }
}
