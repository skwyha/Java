package object_oriented.senior.chapter6_1;

public class Array {
    private int temp[];                     // 定义一个整型数组,此数组大小由外部决定
    private int foot;                       // 定义数组添加的脚标
    public Array(int len) {                 // 数组的大小由外部决定
        if(len > 0) {                       // 判断传入的长度是否大于0
            this.temp = new int[len];       // 根据传入的大小开辟空间
        } else {
            this.temp = new int[1];         // 最小维持一个空间
        }
    }

    public boolean add(int i) {
        if(this.foot < this.temp.length) {  // 判断数组是否已满
            this.temp[foot] = i;            // 没有存满则继续添加
            foot++;                         // 修改脚标
            return true;                    // 添加成功
        } else {                            // 数组已经存满,不能添加
            return false;                   // 添加失败
        }
    }

    public int[] getArray() {               // 得到全部的数组
        return this.temp;
    }

}

class ReverseArray extends Array {          // 定义数组反转类
    public ReverseArray(int len) {
        super(len);
    }

    public int[] getArray() {                       // 覆写getArray方法
        int center = super.getArray().length/2;     // 取得中间索引
        int head = 0;                               // 头部索引
        int tail = super.getArray().length - 1;     // 尾部索引
        for(int x = 0; x < center; x++) {           // 循环交换数据
            int temp = super.getArray()[head];      // 取得元素
            super.getArray()[head] = super.getArray()[tail];
            super.getArray()[tail] = temp;          // 取得元素
            head++;                                 // 修改索引
            tail--;                                 // 修改索引
        }
        return super.getArray();                    // 返回数组内容
    }
}

class SortArray extends Array {                     // 数组排序子类
    public SortArray(int len) {                     // 构造方法接收数组个数
        super(len);                                 // 调用父类构造
    }

    public int[] getArray() {                       // 覆写getArray()方法
        java.util.Arrays.sort(super.getArray());    // 数组排序处理
        return super.getArray();                    // 返回排序后的数组
    }
}
