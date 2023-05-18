
import processing.core.*;


public class StartScene implements Scene
{
    PFont title, comments;
    PImage background, enter;
    public StartScene(PApplet p)
    {
        this.p = p;
        title = p.createFont("1up.ttf", 50);
        comments = p.createFont("SuperMario256.ttf", 45);
        background = p.loadImage("GameTitleScreen.png");
        enter = p.loadImage("enterButton.png");
    }

    public void display()
    {
        //p.background(0);
        p.textAlign(PApplet.CENTER);

        background.resize(480,580);
        p.image(background,0,0);

        //rectangle
        /* p.noStroke();
        p.fill(247,236,218);
        p.rect(80,230,320,200); */

        //title
        p.fill(66, 135, 245);
        p.textFont(title);
        p.text("SNAKE GAME", p.width/2, p.height-450);

        //comments
        p.textFont(comments);
        p.fill(222,186,140);
        p.text("Press", p.width/2, p.height/2);
        p.fill(59,38,11);
        p.text("to start", p.width/2, p.height/2+115);

        //enter key
        enter.resize(150,150);
        p.image(enter, p.width/2-70, p.height/2-25);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
