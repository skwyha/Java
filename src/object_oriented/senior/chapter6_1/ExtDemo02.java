package object_oriented.senior.chapter6_1;



// 子类也可以定义自己的属性或方法
class Student2 extends Person {
    private String school;

    public Student2(String name, int age) {
        super(name, age);
    }

    public String getSchool() {
        return this.school;
    }



    public void setSchool(String school) {

        this.school = school;
    }
}

// 打印结果可以看到可以使用父类的方法
public class ExtDemo02 {
    public static void main(String[] args) {
        Person p = new Person("name",77);
        Student2 per = new Student2("ff",88);
        per.setName("张三");
        String name = per.getName();
        System.out.println(name);
    }
}
