import processing.core.*;


public class Rules implements Scene
{
    PFont instructions, rules;
    PImage background, enter;
    public Rules(PApplet p)
    {
        this.p = p;
        rules = p.createFont("1up.ttf", 50);
        instructions = p.createFont("SuperMario256.ttf", 25);
        background = p.loadImage("rulesPage.png");
        enter = p.loadImage("enterButton.png");
      }

    public void display()
    {
        //p.background(0);
        p.textAlign(PApplet.CENTER);
        p.fill(0);


        background.resize(480,580);
        p.image(background,0,0);

        //instructions
        p.textFont(instructions);
        p.text("Eat the fruit", p.width/2, p.height-425);
        p.text("without bumping into", p.width/2, p.height-375);
        p.text("yourself or the walls!", p.width/2, p.height-325);
        p.text("Use the arrow keys", p.width/2, p.height-250);
        p.text("to eat the fruit!", p.width/2, p.height-200);

        p.fill(235, 52, 119);
        p.text("Press", p.width/2, p.height-145);
        p.text("to start", p.width/2, p.height-60);

        //enter key
        enter.resize(150,150);
        p.image(enter, p.width/2-70, p.height-180);

        //Rules
        p.textFont(rules);
        p.text("RULES:", p.width/2, p.height-480);

      }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
