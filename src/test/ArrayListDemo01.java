package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> allList = null;                 // 定义List对象
        Collection<String> allCollection = null;     // 定义Collection
        allList = new ArrayList<String>();           // 实例化Collection,只能是String类型
        allList.add("Hello");                        // 从Collection继承的方法
        allList.add(0,"World");        // 此方法为List扩充的方法
        System.out.println(allList);                 // 输出集合中的内容
        //allCollection.add("LXH");                    // 增加数据
        //allCollection.add("www.mldn.cn");            // 增加数据



    }
}
