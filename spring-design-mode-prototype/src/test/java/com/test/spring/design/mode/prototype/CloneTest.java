package com.test.spring.design.mode.prototype;

import com.test.spring.design.mode.prototype.greatestage.TheGreatestSage;
import com.test.spring.design.mode.prototype.simple.ConcretePrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 9:07
 */
public class CloneTest {
//    public static void main(String[] args) {
//        ConcretePrototype cp = new ConcretePrototype();
//        cp.setAge(23);
//        cp.setName("张三");
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("哈哈");
//        cp.list = list;
//
//        try {
//            ConcretePrototype copy = (ConcretePrototype)cp.clone();
//            cp.list.add("hello");
//            System.out.println(copy == cp);
//            System.out.println(copy.list == cp.list);
//            System.out.println(copy.getAge() + "," + copy.getName() + "," + copy.list.size() + "," + cp.list.size());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        // 就是有一个现成的对象，这个对象里面有已经设置好的值
//        // 当我要新建一个对象的时候，并且要给新建的对象赋值，而且赋值内容要跟之前的一模一样。
//
//        // 传统做法
//        // ConcretePrototype cp = new ConcretePrototype();
//        // cp.setAge(18);
//
//        // ConcretePrototype copy = new ConcretePrototype();
//        // copy.setAge(cp.getAge());
//        // copy.setName(cp.getName());
//        // ....
//        // 用循环，用反射 可以实现，但是反射性能不高
//
//        // 字节码复制 newInstance()
//
//        // ConcretePrototype copy = cp;
//        // ORM的时候经常用到的
//
//        // 能够直接拷贝其实际内容的数据类型/ 只支持八大基本数据类型+String
//
//
//        // ConcretePrototype copy = cp.clone();
//
//
//    }

    public static void main(String[] args) {
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}
