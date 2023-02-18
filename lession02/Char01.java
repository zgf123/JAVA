public class Char01 {

  public static void main(String[] args) {
    char ch1 = 'a';
    char ch2 = '\t';
    char ch3 = '张';
    char ch4 = 97; // 说明：字符类型可以直接存放一个数字
    System.out.println(ch1);
    System.out.println(ch2);
    System.out.println(ch3);
    System.out.println(ch4); // 当输出c4的时候，会输出97表示的字符 --> 编码的概念

    // 在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符。
    char c1 = 97;
    System.out.println(c1); // a

    char c2 = 'a'; // 输出 'a' 对应的数字
    System.out.println((int)c2); // 97
    char c3 = '张';
    System.out.println((int)c3); // 24352
    char c4 = 24352;
    System.out.println(c4); // 张

    // char类型是可以进行运算的，相当于一个整数，因为它都有对应的unicode码。
    System.out.println('a' + 10); // 107

    // 课堂小测试
    char c5 = 'b' + 1;
    System.out.println((int)c5); // 99
    System.out.println(c5); // 99对应的字符 --> c
  }
  
}
