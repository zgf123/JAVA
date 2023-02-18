public class FloatDetail {
  public static void main(String[] args) {
    // java 的浮点型常量（具体值）默认为double型，声明float型常量，须后加’f‘或’F‘
    // float num1 = 1.1;  // --> 错误
    float num2 = 1.1F;  // --> 正确
    double num3 = 1.1;  // --> 正确
    double num4 = 1.1f;  // --> 正确

    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);


    // 十进制数形式：如，5.12    512.0f    .512  （必须有小数点）
    double num5 = .123;  // 等价于 0.123
    System.out.println(num5);

    // 科学计数法形式：如，5.12e2（5.12 * 10^2）    5.12E-2（5.12 / 10^2）
    System.out.println(5.12e2); // 512
    System.out.println(5.12E-2); // 0.0512
  }
}
