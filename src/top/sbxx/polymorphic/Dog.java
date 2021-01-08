package top.sbxx.polymorphic;

public class Dog extends Animal<String> {
    int age = 88;

    @Override
    public void eat() {
        System.out.println(this.getName() + "吃骨头");
    }
}
