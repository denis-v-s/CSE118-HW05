import java.util.Scanner;
/**
 * *5.17 (Display pyramid)
 */
public class Ex5_17 {

  private static String appendNumber(String line, int n) {
    if (n < 10) {
      line += "  " + n;
    }
    else {
      line += " " + n;
    }
    return line;
  }

  public static void main(String[] args) {
    int charsPerLine = 3;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int lines = scanner.nextInt();
    String line = "";

    for (int i = 0, j = 1; i < lines; i++, j = i + 1) {
      while (j > 0) {
        line = appendNumber(line, j);
        j--;
      }

      j = 2;
      while (j <= i + 1) {
        line = appendNumber(line, j);
        j++;
      }
      System.out.printf("%" + (lines * charsPerLine + i * charsPerLine) + "s%n", line);
      line = "";
    }

    scanner.close();
  }
}