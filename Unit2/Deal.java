public class Deal
{
  public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
  {
    boolean result = goodDeal(originalPrice, salePrice);
    System.out.println("OG Price: " + originalPrice + " Sale Price: "
    + salePrice + " expected: " + expected + " result: " + result);

    if (result == true)
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
    testGoodDeal(10, 3.5, true);
    testGoodDeal(34.50, 12.80, true);
    testGoodDeal(127.99, 110.45, false);
  }
}
