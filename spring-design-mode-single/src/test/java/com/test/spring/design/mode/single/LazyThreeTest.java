package com.test.spring.design.mode.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/9 15:22
 */
public class LazyThreeTest {
    public static void main(String[] args){
        try {
            // 很无聊的情况下，进行破坏
            Class<?> clazz = LazyThree.class;
            // 通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            // 暴力初始化
            Object o1 = c.newInstance();
            // 调用了两次构造方法，相当于new了两次
            // 犯了原则性问题
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
