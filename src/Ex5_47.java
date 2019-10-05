import java.util.Scanner;

/**
 * (Business: check ISBN-13) 
 */
public class Ex5_47 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
    String isbn = scanner.nextLine();
    int sum = 0;
    int n = 0;

    for (int i = 0; i < isbn.length(); i++) {
      n = Character.getNumericValue(isbn.charAt(i));

      if ((i + 1) % 2 == 0) {
        sum += 3 * n;
      }
      else {
        sum += n;
      }
    }

    int checksum = 10 - (sum % 10);

    System.out.println("The ISBN-13 number is " + isbn + checksum % 10);
    scanner.close();
  }
}