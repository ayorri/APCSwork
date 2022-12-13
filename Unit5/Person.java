public class Person
{
  public Person(String nameNew, int petNew)
  {
    name = nameNew;
    pets = petNew;
  }

  private String name;
  private int pets;

  public void hello()
  {
    System.out.println("Hello, my name is " + name + " and I have " + pets + " pets.");
  }
}
