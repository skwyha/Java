package object_oriented.senior.chapter6_2;

// 定义抽象类A
abstract class A {
    // 定义抽象方法print()
    public abstract void print();
}

// 子类通过继承抽象类
class B extends A {
    public void print() {
        System.out.println("抽象方法必须要重写");
    }
}


public class AbstractCaseDemo01 {
    public static void main(String[] args) {
        // 通过子类为抽象类实例化
        A a = new B();
        // 调用的方法是被子类覆写过的方法
        a.print();
    }
}
