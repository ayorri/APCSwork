import java.util.*;

public class AnimalCalc
{
  public static void main(String[] args)
  {
    Creature emperor = new Creature("Penguin", 2, "Yes!");
    Creature otter = new Creature("Sea Otter", 4, "Yes!");
    Creature octopus = new Creature("Octopus", 8, "No!");
    Creature starfish = new Creature("Starfish", 5, "No?");

    ArrayList<Creature> animals = new ArrayList<Creature>();
    animals.add(emperor);
    animals.add(otter);
    animals.add(octopus);
    animals.add(starfish);


    for (Creature a : animals)
    {
      System.out.println(a.facts());
      System.out.println();
    }
  }
}
