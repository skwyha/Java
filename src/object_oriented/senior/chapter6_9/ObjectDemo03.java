package object_oriented.senior.chapter6_9;

class Person6_50 {
    private String name;            // 定义Person类
    private int age;                // 定义name属性
    public Person6_50(String name, int age) {   // 通过构造设置属性内容
        this.name = name;           // 为name属性赋值
        this.age = age;             // 为age属性赋值
    }

    public boolean equals(Object obj) {     // 覆写Object类中的equals()方法
        if(this == obj) {                   // 如果两个对象的地址相等,则肯定是同一个对象
            return true;
        }
        if(!(obj instanceof Person6_50)) {  // 判断传进来的对象是否是Person的实例
            return false;                   // 如果不是,则直接返回false
        }
        Person6_50 per = (Person6_50) obj;  // 将传进来的对象向下转型
        if(per.name.equals(this.name) && per.age == this.age) {     // 逐个属性比较,看是否相等
            return true;                    // 对象内容相等
        } else {
            return false;                   // 对象内容不等
        }
    }

    public String toString() {
        return "姓名: " + this.name + "; 年龄: " + this.age;
    }

}

public class ObjectDemo03 {
    public static void main(String[] args) {
        Person6_50 per1 = new Person6_50("Lili", 19);
        Person6_50 per2 = new Person6_50("Lili", 18 );
    }
}
