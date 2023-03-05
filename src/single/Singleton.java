package single;

public class Singleton {
  public static void main(String[] args) {
    System.out.println(Cat.getInstance().getName());
  }
}

class Cat {
  private String name;
  private static Cat instance;

  private Cat() {
    this.name = "单例";
  };

  static Cat getInstance() {
    if (instance == null) {
      instance = new Cat();
    }
    return instance;
  }

  String getName() {
    return this.name;
  }
}
