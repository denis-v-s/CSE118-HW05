/**
 * (Financial application: find the sales amount)
 */
public class Ex5_39 {
  public static void main(String[] args) {
    double base = 5000;
    double goal = 30_000;

    double tier1 = 5000 * .08;
    double tier2 = 5000 * .10;

    double remainder = goal - (base + tier1 + tier2);
    double tier3 = remainder / .12;
    System.out.printf("Minimum amount of sales: $%,.2f", 5000 + 5000 + tier3);
  }
}