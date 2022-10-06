public class Deal
{
  public static void testGoodDeal(double originalPrice, double salePrice)
  {
    if (salePrice <= 0.75 * originalPrice)
    {
    System.out.println("DEAL!!");
    }else{
    System.out.println("Aww not a deal");
    }
  }
  public static boolean goodDeal(double originalPrice, double salePrice)
  {
    return (salePrice <= 0.75 * originalPrice);
  }
  public static void main(String[] args)
  {
    testGoodDeal(10, 3.5);
    testGoodDeal(34.50, 12.80);
    testGoodDeal(127.99, 110.45);
  }
}
