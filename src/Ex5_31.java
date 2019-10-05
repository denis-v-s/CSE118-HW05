import java.util.Scanner;
/**
 * (Financial application: compute CD value)
 */
public class Ex5_31 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the amount: ");
    double amount = scanner.nextDouble();

    System.out.print("Enter APY rate: ");
    double apy = scanner.nextDouble();

    System.out.print("Enter the number of months: ");
    int months = scanner.nextInt();

    System.out.printf("%-10s %8s%n", "Month", "CD Value");
    for (int i = 0; i < months; i++) {
      amount += amount * apy / 1200;
      System.out.printf("%-10d %.2f %n", i + 1, amount);
    }

    scanner.close();
  }
}