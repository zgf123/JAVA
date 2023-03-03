import java.util.Scanner;

public class a01 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入年龄");

    int age = myScanner.nextInt();

    if (age > 18) {
      System.out.println("超过18岁了");
    }
    System.out.println("程序继续...");

    myScanner.close();
  }
}