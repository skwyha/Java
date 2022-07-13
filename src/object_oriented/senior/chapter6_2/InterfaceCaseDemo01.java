package object_oriented.senior.chapter6_2;

// 定义接口A
interface A1 {

    // 定义抽象方法print()
    void print();
}

// 子类实现接口
class B1 implements A1 {
    public void print() {
        System.out.println("接口是为了解决Java不能多继承的问题");
    }
}

public class InterfaceCaseDemo01 {
    public static void main(String[] args) {
        A1 a = new B1();
        a.print();
    }
}
