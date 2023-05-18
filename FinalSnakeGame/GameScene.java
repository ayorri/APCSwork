//
// GameScene.java
//


import processing.core.*;


public class GameScene implements Scene
{
    PImage field, apple;
    PFont Score;
    public GameScene(PApplet p)
    {
        this.p = p;
        this.position = new PVector(65, 165);
        this.velocity = new PVector(0,0);
        Score = p.createFont("1up.ttf", 50);
        //PVector position = new PVector(60,60);
        field = p.loadImage("snakeField2.png");
        apple = p.loadImage("apple3.png");
    }

    public void display()
    {
        field.resize(480,580);
        p.image(field,0,0);

        //PVector position = new PVector(width/2,height/2);
        // player
        p.noStroke();
        p.fill(20,86,227);
        p.ellipse(position.x, position.y, 40, 40);
        position.add(velocity);

        //Apple
        apple.resize(40,40);
        p.image(apple,195,345);

///*
        if(position.x > 195 && position.x < 235 && position.y > 345 && position.y < 385)
        {
          p.image(apple, 235, 145);
          score ++;
          //velocity += 3;
        }
//*/
        //draw scores
        p.textFont(Score);
        p.fill(66, 135, 245);
        p.text("SCORE: " + score, p.width/2, p.height-495);


        //check whether Im done with scene
    }

    public void handleKeyPressed()
    {
        if (p.keyCode == PApplet.RIGHT)
        {
            velocity.x = 5;
            velocity.y = 0;
        }
        else if (p.keyCode == PApplet.LEFT)
        {
            velocity.x = -5;
            velocity.y = 0;
        }
        else if (p.keyCode == PApplet.DOWN)
        {
            velocity.y = 5;
            velocity.x = 0;
        }
        else if (p.keyCode == PApplet.UP)
        {
            velocity.y = -5;
            velocity.x = 0;
        }
    }

    public void handleCheckEdges()
    {
     //if (position.x > width || position.x < 0)

    }

    //call this game so I can change current in game classes
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private int score = 0;
}
