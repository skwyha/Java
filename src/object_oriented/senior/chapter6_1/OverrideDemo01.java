package object_oriented.senior.chapter6_1;

class Person02 {
    void print() {
        System.out.println("Person --> void print()");
    }
}

class Student02 extends Person02 {
    public void print() {
        System.out.println("Student --> void print()");
    }
}

public class OverrideDemo01 {
    public static void main(String[] args) {
        new Student02().print();

    }
}
