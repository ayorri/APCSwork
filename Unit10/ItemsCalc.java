import java.util.*;

public class ItemsCalc
{
  public static float averageItemsPrice(ArrayList<Items> items)
  {
    float total = 0;

    for (Items i : items)
      total += i.getPrice();

    return total / items.size();
  }
  public static void testAveragePrice(int expected, ArrayList<Items> items)
  {
    float result = averageItemsPrice(items);

    System.out.println("Expected Average: " + expected +
    " Resulting Average: " + averageItemsPrice(items));

    if(result == expected)
      System.out.println("YAYY");
    else
      System.out.println("Awww");

  }
  public static void main(String[] args)
  {
    ArrayList<Items> items = new ArrayList<Items>();

    items.add(new Items("Apples",2));
    items.add(new Items("Cheetos", 4));
    items.add(new Items("Cartons of Milk", 6));

    for (Items i: items)
      System.out.println("Price of " + i.getName() + ": " + i.getPrice());

    testAveragePrice(4, items);
  }
}
