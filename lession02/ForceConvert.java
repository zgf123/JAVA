/**
 * ForceConvert
 */
public class ForceConvert {

  public static void main(String[] args) {
    int n1 = (int)1.9; // 1  精度丢失

    int n2 = 2000;
    byte b1 = (byte)n2;
    System.out.println(b1); // 溢出
  }
}