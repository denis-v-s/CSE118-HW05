/**
 * (Conversion from kilograms to pounds)
 */
public class Ex5_3 {

  public static void main(String[] args) {
    int limit = 200;

    System.out.printf("| %10s | %10s |\r\n", "Kilograms", "Pounds");
    // 1 3 ... 197 199
    for (int i = 1; i < limit; i += 2) {
      System.out.printf("| %-10d | %10.1f |\r\n", i, i * 2.2);
    }
  }
}