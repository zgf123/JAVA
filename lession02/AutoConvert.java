/**
 * AutoConvert
 */
public class AutoConvert {

  public static void main(String[] args) {
    int num  = 'a';
    double c1 = 80;
    System.out.println(num);
    System.out.println(c1);

    // 有多种类型的数据混合运算时
    // 系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
    int n1 = 10;
    // float d1 = n1 + 1.1; // 错误 n1 + 1.1 => 结果类型是 double
    // double d1 = n1 + 1.1; // 正确 n1 + 1.1 => 结果类型是 double
    float d1 = n1 + 1.1f; // 正确 n1 + 1.1 => 结果类型是 float
    System.out.println(d1);

    // 当我们把容量大的数据类型赋值给容量小的数据类型时就会报错，反之就会进行自动转换
    // int n2 = 1.1; // 错误 double -> int

    // (byte, short) 和 char 之间不会相互自动转换
    // 把当具体数赋给 byte 时，1、先判断该数是否在 byte 范围内，如果是就可以
    byte b1 = 10; // 对， -128~127
    int b2 = 1; // n2 是int
    // byte b2 = n2; // 错误，原因：如果是变量赋值，判断类型

    double a = 1.1f;

    float c = b2;

    System.out.println('a');
  }
}