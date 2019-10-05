import java.util.Scanner;
/**
 * (Count positive and negative numbers and compute the average of numbers)
 */
public class Ex5_1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");

    int positiveCount = 0;
    int negativeCount = 0;
    double sum = 0;
    int input = 0;

    do {
      input = scanner.nextInt();
      if (input < 0) negativeCount++; 
      if (input > 0) positiveCount++;

      // keep track of sum
      sum += input;
    } while (input != 0);

    int count = negativeCount + positiveCount;
    
    if (count > 0) {
      System.out.println("The number of positives is: " + positiveCount);
      System.out.println("The number of negatives is: " + negativeCount);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + (sum / (double)count));
    }
    else {
      System.out.println("No numbers are entered except 0");
    }

    scanner.close();
    // 1 2 –1 3 0
  }
}