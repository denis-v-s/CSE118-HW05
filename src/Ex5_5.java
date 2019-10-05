/**
 * 5.5 (Conversion from kilograms to pounds and pounds to kilograms)
 */
public class Ex5_5 {

  public static void main(String[] args) {
    int limit = 200;

    System.out.printf("| %10s | %10s | %10s | %10s |\r\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
    // 1 3 ... 197 199
    for (int i = 1, j = 0; i < limit; i += 2, j++) {
      System.out.printf("| %-10d | %10.1f | %-10d | %10.1f |\r\n", 
        i,                   // kg (2 point increment, starting from 1)
        i * 2.2,             // lbs
        20 + j * 5,          // kg (5 point increment, starting from 20)
        (20 + j * 5) / 2.2   // lbs
      );
    }
  }
}