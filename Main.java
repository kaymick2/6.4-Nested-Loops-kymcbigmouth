import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter number of rows and smash that enter key:");
    int rows = in.nextInt();
    int stars = rows;
    int count = 0;
    while (rows > 0) {
      for (int m = 1; m <= count; m++) {
        System.out.println("");
      }
      for (int k = 1; k <= (2 * x) - 1; k++) {
        System.out.println("*");
      }

      count++;

      rows--;
    }
  }
}
