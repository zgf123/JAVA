/**
 * ArithmetricOperator
 */
public class ArithmetricOperator {

  public static void main(String[] args) {
    System.out.println(10 / 4); // 从数学来看是2.5，java中是 2
    System.out.println(10.0 / 4); // java中是 2.5

    double d = 10 / 4;
    System.out.println(d);  // 2.0


    System.out.print(10 % 3); // 1
    System.out.print(-10 % 3); // -1
    System.out.print(10 % -3); // 1
    System.out.print(-10 % -3); // -1
  }
}