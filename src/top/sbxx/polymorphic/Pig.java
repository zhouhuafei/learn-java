package top.sbxx.polymorphic;

public class Pig extends Animal {
    @Override
    public void eat() {
        System.out.println(this.getName() + "吃米糠");
    }
}
