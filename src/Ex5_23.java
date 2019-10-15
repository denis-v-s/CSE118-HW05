/**
 * (Demonstrate cancellation errors)
 */
public class Ex5_23 {
  public static void main(String[] args) {
    int n = 5000;

    // from 1 to n
    double ascendingSum = 0;
    for (int i = 1; i <= n; i++) {
      ascendingSum += 1.0 / i;
    } // 9.094508852984404

    // from n to 1
    double descendingSum = 0;
    for (int i = n; i > 0; i--) {
      descendingSum += 1.0 / i;
    } // 9.09450885298443

    System.out.println("from larger number to smaller number = " + ascendingSum);
    System.out.println("from smaller number to larger number = " + descendingSum);
    System.out.println("larger->smaller - smaller->larger = " + (ascendingSum - descendingSum));
  }
}