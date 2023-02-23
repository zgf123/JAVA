/**
 * StringToBasic
 */
public class StringToBasic {

  public static void main(String[] args) {
    int n1 = 100;
    float f1 = 1.1f;
    double d1 = 4.5;
    boolean b1 = true;
    String s1 = n1 + "";
    String s2 = f1 + "";
    String s3 = d1 + "";
    String s4 = b1 + "";
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println("--------------");

    // String --> 对应的基本数据类型
    String s5 = "123";
    int num1 = Integer.parseInt(s5);
    byte num2 = Byte.parseByte(s5);
    short num3 = Short.parseShort(s5);
    float num4 = Float.parseFloat(s5);
    double num5 = Double.parseDouble(s5);
    long num6 = Long.parseLong(s5);
    boolean b = Boolean.parseBoolean("true");

    System.out.println(num1); // 123
    System.out.println(num2); // 123
    System.out.println(num3); // 123
    System.out.println(num4); // 123.0
    System.out.println(num5); // 123.0
    System.out.println(num6); // 123
    System.out.println(b); // true

    System.out.println(s5.charAt(0));

  }
}