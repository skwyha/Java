package object_oriented.senior.chapter6_9;

interface Message {         // 定义接口
    public void print();    // 接口方法
    default void fun() {
        System.out.println("接口方法");
    }
}

class MessageImpl implements Message {
    @Override
    public void print() {
        System.out.println("覆写接口方法");
    }
}

public class TestDemo {

}
