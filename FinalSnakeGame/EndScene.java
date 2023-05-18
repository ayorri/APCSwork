//
// EndScene.java
//


import processing.core.*;


public class EndScene implements Scene
{
    PImage endSnake;
    public EndScene(PApplet p)
    {
        this.p = p;
        endSnake = p.loadImage("EndSnake.jpeg");
    }

    public void display()
    {
        endSnake.resize(800,800);
        p.image(endSnake,0,0);

        p.background(0);
        p.textAlign(PApplet.CENTER);
        p.textSize(50);
        p.fill(255, 0, 0);
        p.text("GAME OVER", p.width/2, p.height/4);
    }

    public void handleKeyPressed()
    {

    }

    public void handleCheckEdges()
    {
    //  if (position.x > width || position.x < 0)
    }

    private PApplet p;
}
