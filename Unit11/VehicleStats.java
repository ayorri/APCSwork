import java.util.*;

public class VehicleStats
{
  public static void testVehicleStats(ArrayList<Vehicle> vehicles, float e)
  {
    float result = totalWheels(vehicles);
    for (Vehicle v: vehicles)
      System.out.println("# of wheels in a " + v.name() + ": " + v.wheelCount());

    System.out.println();
    System.out.println("Expected total: " + e + " Result: " + result);

    if (result == e)
      System.out.println("GOT IT!");
    else
      System.out.println("WRONG!");
  }
  public static float totalWheels(ArrayList<Vehicle> vehicles)
  {
    float total = 0;

    for (int i=0; i<vehicles.size(); i++)
    {
      Vehicle v = vehicles.get(i);
      total += v.wheelCount();
    }

    return total;
  }
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

    testVehicleStats(vehicles, 9);
  }
}
