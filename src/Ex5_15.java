/**
 * (Display the ASCII character table)
 */
public class Ex5_15 {

  public static void main(String[] args) {
    for (char c = 33; c < 127; c++) {
      System.out.print(c + " ");
      if ((c - 32) % 10 == 0) {
        System.out.println("");
      }
    }
  }
}