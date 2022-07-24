package object_oriented.senior.chapter6_9;

interface USB {             // 定义USB接口
    public void start();    // USB设备开始工作
    public void stop();     // USB设备停止工作
}

class Computer {
    public static void plugin(USB usb) {        // 只要是USB的设备就都可以向此地方插入
        System.out.println("====USB设备工作====");

        usb.start();                            // 让USB设备开始工作

        usb.stop();                             // 让USB设备停止工作
    }
}

class Flash implements USB {
    public void start() {
        System.out.println("U盘开始工作");
    }

    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Print implements USB {
    public void start() {
        System.out.println("打印机开始工作");
    }

    public void stop() {
        System.out.println("打印机结束工作");
    }
}


public class InterfaceCaseDemo02 {
    public static void main(String[] args) {
        Computer.plugin(new Flash());       // 插入U盘
        Computer.plugin(new Print());       // 插入打印机
    }
}
