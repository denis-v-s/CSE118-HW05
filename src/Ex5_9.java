import java.util.Scanner;

/**
 * (Find the two highest scores)
 */
public class Ex5_9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int numberOfStudents = scanner.nextInt();

    int highestScore = 0;
    int secondHighestScore = 0;
    int score = 0;
    String name = "";
    String highestScoreName = "";
    String secondHighestScoreName = "";

    System.out.println("Enter the student list with space separated 'name', and 'score'");
    for (int i = 0; i < numberOfStudents; i++) {
      name = scanner.next();
      score = scanner.nextInt();

      if (score > highestScore) {
        highestScore = score;
        highestScoreName = name;
      }
      else if (score > secondHighestScore && score < highestScore) {
        secondHighestScore = score;
        secondHighestScoreName = name;
      }
    }

    System.out.printf("Student withe the highest score is %s with %d points\r\n", highestScoreName, highestScore);
    System.out.printf("Student withe the 2nd highest score is %s with %d points\r\n", secondHighestScoreName, secondHighestScore);
    scanner.close();

    // 4 
    // john 5 jane 4 mark 9 noel 8
  }
}