package object_oriented.senior.chapter6_1;

abstract class A {
    public static final String FLAG = "CHINA";
    private String name = "李兴华";

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();   // 定义抽象方法
}

class B extends A {

    public B(String name) {
        super(name);
    }


    public void print() {
        System.out.println("FlAG");
        System.out.println("name = " + super.getName());
    }
}

public class AbstractDemo02 {

}
