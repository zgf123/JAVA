package poly01;

public class Master {

  private String name;

  public Master(String name) {
    this.name = name;
  }

  public String getName(String name) {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // public void feed(Dog dog, Bone bone) {
  // System.out.println("主人 " + this.name + " 给 " + dog.getName() + " 喂 " +
  // bone.getName());
  // }

  // public void feed(Cat cat, Fish fish) {
  // System.out.println("主人 " + this.name + " 给 " + cat.getName() + " 喂 " +
  // fish.getName());
  // }

  // ! animal 编译类型是 Animal，可以指向(接收) Animal子类的对象
  public void feed(Animal animal, Food food) {
    System.out.println("主人 " + this.name + " 给 " + animal.getName() + " 喂 " + food.getName());
  }

}
