package object_oriented.senior.chapter6_9;

interface Fruit {           // 定义一个水果的接口
    public void eat();      // 吃水果的方法
}

class Apple implements Fruit {
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit {
    public void eat() {
        System.out.println("吃橙子");
    }
}

class Factory {
    public static Fruit getInstance(String className) {
        Fruit f = null;
        if("apple".equals(className)) {
            f = new Apple();
        }
        if("orange".equals(className)) {
            f= new Orange();
        }
        return f;
    }
}

public class InterfaceCaseDemo04 {
    public static void main(String args[]) {
        Fruit f = null;                      // 定义接口对象
        f = Factory.getInstance("apple");   // 通过工厂取得实例
        f.eat();                            // 调用方法
        f = Factory.getInstance("orange");   // 通过工厂取得实例
        f.eat();                            // 调用方法
    }
}