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

    // 通常情况下，应该使用double型，因为它比float型更精确。如：
    double num9 = 2.1234567851;
    float num10 = 2.1234567851F;
    System.out.println(num9);
    System.out.println(num10);

    // 浮点数使用陷阱：2.7 和 8.1 / 3 比较。
    double num11 = 2.7;
    double num12 = 8.1 / 3; // 2.7
    System.out.println(num11); // 2.7
    System.out.println(num12); // 接近2.7的一个小数，而不是2.7
    // 得到一个重要的使用点：当我们对运算结果是小数的进行系那个的呢过判断时，要小心
    // 应该是两个数的差值的绝对值，在某个精度范围类判断
    if(num11 == num12) {
      // 不会执行
      System.out.println("相等");
    }
    // 正确的写法
    System.out.println(Math.abs(num11 - num12));
    if(Math.abs(num11 - num12) < 0.000001) {
      System.out.println("差值非常小，到我的规定精度，认为相等...");
    }
    // 如果是直接查询得到的小数或直接复制，是可以判断相等的
    double num13 = 2.7;
    if(num11 == num13) {
      System.out.println("num11等于num13");
    }
  }
}
