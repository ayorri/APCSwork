public class String2D
{
  public static void main(String[] args)
  {
    String[][] zodiacs = new String[3][4];

    zodiacs[0][0] = "Aries";
    zodiacs[0][1] = "Taurus";
    zodiacs[0][2] = "Gemini";
    zodiacs[0][3] = "Cancer";
    zodiacs[1][0] = "Leo";
    zodiacs[1][1] = "Virgo";
    zodiacs[1][2] = "Libra";
    zodiacs[1][3] = "Scorpio";
    zodiacs[2][0] = "Sagittarius";
    zodiacs[2][1] = "Capricorn";
    zodiacs[2][2] = "Aquarius";
    zodiacs[2][3] = "Pisces";

    System.out.println("zodaics: ");
    for (String[] row : zodiacs)
    {
      for (String zodiac : row)
        System.out.print(zodiac + " ");
      System.out.println();
    }
  }
}
