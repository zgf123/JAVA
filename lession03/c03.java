public class c03 {

  public static void main(String[] args) {
    int num = 5;

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (j == 1 || j == 2 * i - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
    for (int i = num - 1; i >= 1; i--) {
      for (int j = 1; j <= num - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (j == 1 || j == 2 * i - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }

  }
}