import java.util.Scanner;

/**
 * (Math: combinations)
 */
public class Ex5_43 {

  public static void main(String[] args) {
    System.out.print("Enter combinations upper bound number: ");
    Scanner scanner = new Scanner(System.in);
    int ubound = scanner.nextInt();
    int n = 0;

    for (int i = 1; i < ubound; i++) {
      for (int j = i + 1; j <= ubound; j++) {
        System.out.printf("%5d %5d %n", i, j);
        n++;
      }
    }

    System.out.println("Total number of combinations: " + n);
    scanner.close();
  }
}