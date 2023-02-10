import java.util.*;

public class VehicleTest
{
  public static void main(String[] args)
  {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Car ferrari = new Car();
    vehicles.add(ferrari);

    Motorcycle suzuki = new Motorcycle();
    vehicles.add(suzuki);

    Bicycle publicBike = new Bicycle();
    vehicles.add(publicBike);

    Unicycle eBay = new Unicycle();
    vehicles.add(eBay);

    for (Vehicle v: vehicles)
    {
      System.out.println("A " + v.name() + " has " + v.wheelCount() + " wheels. ");
      System.out.println("It is human powered: " + v.isHumanpowered());
      System.out.println();
    }
  }
}
