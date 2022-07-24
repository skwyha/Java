package object_oriented.senior.chapter6_6;

class A6_30 {                   // 定义类A
    public void fun1() {        // 定义fun1（）方法
        System.out.println("A --? public void fun1(){}");
    }

    public void fun2() {        // 定义fun2（）方法
        this.fun1();
    }
}

class BA_30 extends A6_30 {
    public void fun1() {
        System.out.println("B --> public void fun1() {}");
    }
    public void fun3() {
        System.out.println("B --> public void fun3() {}");
    }
}


public class PolDemo01 {
    public static void main(String[] args) {
        BA_30 b = new BA_30();      // 定义子类实例化对象
        A6_30 A = b;                // 发生了向上转型的关系， 子类
        b.fun1();                   // 此方法被子类覆写过
    }
}
