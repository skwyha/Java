package program_design.chapter9;

class MyThread extends Thread {                 // 继承Thread类
    private String name;                        // 在类中定义一个属性
    public MyThread(String name) {              // 通过构造方法设置属性内容
        this.name = name;                       // 为name属性赋值
    }
    public void run() {                         // 覆写Thread类中的run（）方法
        for(int i =0; i < 10; i++) {            // 循环10次输出
            System.out.println(name + "运行，i=" + i);

        }
    }
}



public class ThreadDemo01 {
    public static void main(String[] args) {

    }
}
