public class IntDetail {
  public static void main(String[] args) {
    int a = 19;
    int b = 1; // 这里不能使用 1L，因为int 和 long 类型不兼容。

    System.out.println(a);
    System.out.println(b);
  }
}
