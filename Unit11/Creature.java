public class Creature extends Animal
{
  public Creature(String name, int legCount, String furriness)
  {
    super(name, legCount, furriness);
  }
  public String facts(){
    return "I am a " + name + " and I have " + legCount
    + " legs. Am I furry?: " + furriness;
  }
}
