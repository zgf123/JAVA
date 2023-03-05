package poly02;

/**
 * PolyMethod
 */
public class PolyMethod {

  public static void main(String[] args) {
    A a = new A();

    // 传入不同的参数调用不同的sum方法，构成多态
    System.out.println(a.sum(1, 2) + "--" + a.sub(1, 2, 3));
  }
}

class B {
  private String name = this.aaa();

  public void say() {
    System.out.println("null");
  }

  public String aaa() {
    System.out.println("aaa 调用了");
    return "aa";
  }
}

class A extends B {
  public int sum(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }
}