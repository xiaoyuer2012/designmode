package com.test.spring.design.mode.single;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 14:28
 */
public class LazyOne {
    private LazyOne() {}

    // 静态块，公共内存区域
    private static LazyOne lazy = null;

    public static LazyOne getInstance() {
        // 调用方法之前，先判断
        // 如果没有初始化，将其进行初始化，并且赋值
        // 将该实例缓存好
        if(lazy == null) {
            // 两个线程都会进入这个if里面
            lazy = new LazyOne();
        }
        // 如果已经初始化，直接返回之前已经保存好的结果
        return lazy;
    }

    public void chifan() {
        System.out.println("吃饭了--" + lazy.toString());
    }
}
