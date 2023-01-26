import java.util.*;
// calcuates average # of pets
// calculates name of person with the most pets
// calculates name of people who have at least 2 pets

public class PersonStats
{
  public static float averagePets(ArrayList<Persons10> pets)
  {
    float total = 0;

    for(Persons10 p: pets)
      total += p.getPets();

    return total / pets.size();
  }

 public static String mostPets(ArrayList<Persons10> pets)
  {
    Persons10 max = pets.get(0);
    for(Persons10 p: pets){
      if(p.getPets() > max.getPets())
      max = p;
    }
    return max.getName();
  }

  public static ArrayList<Persons10> atLeastTwo(ArrayList<Persons10> pets)
  {
    ArrayList<Persons10> petLady = new ArrayList<Persons10> ();
    for(Persons10 p: pets)
    {
      if(p.getPets() >= 2){
        petLady.add(p);
      }

    }
  /*  for(Persons10 p: pets)
    if(minimum >= 2)
    minimum = p.getPets(); */
    //System.out.println(p.getName());
    return petLady;
  }
  public static void main(String[] args)
  {
    ArrayList<Persons10> pets = new ArrayList<Persons10>();


    pets.add(new Persons10("Eunchae", 6));
    pets.add(new Persons10("Yunjin", 3));
    pets.add(new Persons10("Chaewon", 1));
    pets.add(new Persons10("Sakura", 0));
    pets.add(new Persons10("Kazuha", 2));

    /*for(Persons10 p: petLady)
    {
    System.out.println("Most pets: " + p.getName() + mostPets(petLady));
    if (p.getPets() == atLeastTwo(twoPets))
    System.out.println("Ppl with at least 2 pets: " + p.getName());
    }
    */
    System.out.println("Most pets: " + mostPets(pets));
    System.out.println("Average # of pets: " + averagePets(pets));
    System.out.println("Ppl with at least 2 pets: ");

    ArrayList<Persons10> petLady = atLeastTwo(pets);
    for(Persons10 p: petLady)
      System.out.println(p.getName());
  }
}
